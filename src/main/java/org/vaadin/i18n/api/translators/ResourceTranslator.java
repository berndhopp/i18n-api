package org.vaadin.i18n.api.translators;

import com.vaadin.server.VaadinSession;

import java.util.ResourceBundle;

public class ResourceTranslator implements Translator{

    private final String baseName;

    public ResourceTranslator(){
        this("/translations.properties");
    }

    public ResourceTranslator(String baseName) {
        this.baseName = baseName;
    }

    public String translate(String term) {
        final ResourceBundle bundle = ResourceBundle.getBundle(baseName, VaadinSession.getCurrent().getLocale());

        final String resource = bundle.getString(term);

        return postProcess(resource);
    }

    private String postProcess(String resource) {
        return resource;
    }
}
