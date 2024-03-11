package com.konfigthis.client;

import com.konfigthis.client.api.PronunciationDictionaryApi;
import com.konfigthis.client.api.AudioNativeApi;
import com.konfigthis.client.api.DubbingApi;
import com.konfigthis.client.api.ModelsApi;
import com.konfigthis.client.api.ProjectsApi;
import com.konfigthis.client.api.RedirectApi;
import com.konfigthis.client.api.SamplesApi;
import com.konfigthis.client.api.SpeechHistoryApi;
import com.konfigthis.client.api.SpeechToSpeechApi;
import com.konfigthis.client.api.TextToSpeechApi;
import com.konfigthis.client.api.UserApi;
import com.konfigthis.client.api.VoiceGenerationApi;
import com.konfigthis.client.api.VoicesApi;
import com.konfigthis.client.api.WorkspaceApi;

public class ElevenLabs {
    private ApiClient apiClient;
    public final PronunciationDictionaryApi pronunciationDictionary;
    public final AudioNativeApi audioNative;
    public final DubbingApi dubbing;
    public final ModelsApi models;
    public final ProjectsApi projects;
    public final RedirectApi redirect;
    public final SamplesApi samples;
    public final SpeechHistoryApi speechHistory;
    public final SpeechToSpeechApi speechToSpeech;
    public final TextToSpeechApi textToSpeech;
    public final UserApi user;
    public final VoiceGenerationApi voiceGeneration;
    public final VoicesApi voices;
    public final WorkspaceApi workspace;

    public ElevenLabs() {
        this(null);
    }

    public ElevenLabs(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.pronunciationDictionary = new PronunciationDictionaryApi(this.apiClient);
        this.audioNative = new AudioNativeApi(this.apiClient);
        this.dubbing = new DubbingApi(this.apiClient);
        this.models = new ModelsApi(this.apiClient);
        this.projects = new ProjectsApi(this.apiClient);
        this.redirect = new RedirectApi(this.apiClient);
        this.samples = new SamplesApi(this.apiClient);
        this.speechHistory = new SpeechHistoryApi(this.apiClient);
        this.speechToSpeech = new SpeechToSpeechApi(this.apiClient);
        this.textToSpeech = new TextToSpeechApi(this.apiClient);
        this.user = new UserApi(this.apiClient);
        this.voiceGeneration = new VoiceGenerationApi(this.apiClient);
        this.voices = new VoicesApi(this.apiClient);
        this.workspace = new WorkspaceApi(this.apiClient);
    }

}
