@RestController
@RequestMapping("/api")
public class ChatController {

    @PostMapping("/chat")
    public ResponseEntity<Map<String, String>> chat(@RequestBody Map<String, String> body) {
        String prompt = body.get("prompt");

        // 예시: OpenAI API 호출
        String answer = LlmService.callOpenAi(prompt);

        Map<String, String> response = new HashMap<>();
        response.put("response", answer);
        return ResponseEntity.ok(response);
    }
}
