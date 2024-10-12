package gemini.workshop;

import dev.langchain4j.model.vertexai.VertexAiGeminiChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

public class QA {
    public static void main(String[] args) {
        ChatLanguageModel model = VertexAiGeminiChatModel.builder()
            .project(System.getenv("PROJECT_ID"))
            .location(System.getenv("LOCATION"))
            .modelName("gemini-1.5-flash-001")
            .build();

        System.out.println(model.generate("Create a poem about a pig learning java programming"));
    }
}