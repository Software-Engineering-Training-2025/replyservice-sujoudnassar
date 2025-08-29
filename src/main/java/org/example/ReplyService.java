package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {
        // 1. معالجة الرسائل الفارغة أو null
        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }

        // 2. توحيد شكل الرسالة (lowercase + trim)
        String normalized = message.trim().toLowerCase();

        // 3. المقارنة مع الرسائل المعطاة
        if (normalized.equals("hi")) {
            return pickReply(type,
                    "Hello. How may I assist you today?",   // FORMAL
                    "Hey there! 😊 How can I help?",        // FRIENDLY
                    "Hello. How can I help?");              // CONCISE
        } else if (normalized.equals("hello")) {
            return pickReply(type,
                    "Hello. How may I assist you today?",   // FORMAL
                    "Hi! 👋 What’s up?",                    // FRIENDLY
                    "Hello. How can I help?");              // CONCISE
        } else if (normalized.equals("how are you")) {
            return pickReply(type,
                    "I am functioning properly. How may I assist you?",   // FORMAL
                    "Doing great! 😄 How can I help?",                    // FRIENDLY
                    "I’m good. How can I help?");                         // CONCISE
        } else if (normalized.equals("i need help")) {
            return pickReply(type,
                    "I can assist with that. Please provide more details.",  // FORMAL
                    "I’ve got you! 🙂 Tell me a bit more.",                  // FRIENDLY (emoji changed)
                    "Share details; I’ll help.");                            // CONCISE
        }else if (normalized.equals("can you help me with my account")) {
            return pickReply(type,
                    "Certainly. Please describe the account issue.",   // FORMAL
                    "Sure thing! 😊 What’s wrong with the account?"
                    ,   // FRIENDLY
                    "Describe the account issue…");                    // CONCISE (ellipsis added)
        } else if (normalized.equals("thanks")) {
            return pickReply(type,
                    "You are welcome.",   // FORMAL
                    "Anytime! 🙌",        // FRIENDLY
                    "You’re welcome.");   // CONCISE
        } else if (normalized.equals("bye")) {
            return pickReply(type,
                    "Goodbye.",             // FORMAL
                    "See you later! 👋",    // FRIENDLY
                    "Goodbye.");            // CONCISE
        } else if (normalized.equals("what is your name")) {
            return pickReply(type,
                    "I am your virtual assistant.",   // FORMAL
                    "I’m your helper bot 🤖",         // FRIENDLY
                    "I’m your assistant.");           // CONCISE
        }

        // 4. الرد الافتراضي (أي نص آخر)
        return pickReply(type,
                "Could you clarify your request?",   // FORMAL
                "Could you tell me more?",           // FRIENDLY
                "Please clarify.");                  // CONCISE
    }

    // 5. ميثود مساعدة لاختيار نوع الرد
    private String pickReply(ReplyType type, String formal, String friendly, String concise) {
        if (type == ReplyType.FORMAL) return formal;
        if (type == ReplyType.FRIENDLY) return friendly;
        return concise; // إذا كان CONCISE أو أي شي ثاني
    }
}

