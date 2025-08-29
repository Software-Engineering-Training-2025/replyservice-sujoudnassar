package org.example;

/**
 * Students implement this method to return the exact outputs defined in README.
 */
public class ReplyService {

    public String reply(String message, ReplyType type) {

        if (message == null || message.trim().isEmpty()) {
            return "Please say something.";
        }


        String normalized = message.trim().toLowerCase();


        if (normalized.equals("hi")) {
            return pickReply(type,
                    "Hello. How may I assist you today?",
                    "Hey there! 😊 How can I help?",
                    "Hello. How can I help?");
        } else if (normalized.equals("hello")) {
            return pickReply(type,
                    "Hello. How may I assist you today?",
                    "Hi! 👋 What’s up?",
                    "Hello. How can I help?");
        } else if (normalized.equals("how are you")) {
            return pickReply(type,
                    "I am functioning properly. How may I assist you?",
                    "Doing great! 😄 How can I help?",
                    "I’m good. How can I help?");
        } else if (normalized.equals("i need help")) {
            return pickReply(type,
                    "I can assist with that. Please provide more details.",
                    "I’ve got you! 🙂 Tell me a bit more.",
                    "Share details; I’ll help.");
        }else if (normalized.equals("can you help me with my account")) {
            return pickReply(type,
                    "Certainly. Please describe the account issue.",
                    "Sure thing! 😊 What’s wrong with the account?"
                    ,   // FRIENDLY
                    "Describe the account issue…");
        } else if (normalized.equals("thanks")) {
            return pickReply(type,
                    "You are welcome.",
                    "Anytime! 🙌",
                    "You’re welcome.");
        } else if (normalized.equals("bye")) {
            return pickReply(type,
                    "Goodbye.",
                    "See you later! 👋",
                    "Goodbye.");
        } else if (normalized.equals("what is your name")) {
            return pickReply(type,
                    "I am your virtual assistant.",
                    "I’m your helper bot 🤖",
                    "I’m your assistant.");
        }


        return pickReply(type,
                "Could you clarify your request?",
                "Could you tell me more?",
                "Please clarify.");
    }


    private String pickReply(ReplyType type, String formal, String friendly, String concise) {
        if (type == ReplyType.FORMAL) return formal;
        if (type == ReplyType.FRIENDLY) return friendly;
        return concise;
    }
}

