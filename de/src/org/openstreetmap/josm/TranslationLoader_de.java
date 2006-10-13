package org.openstreetmap.josm;

import java.util.Locale;

import org.openstreetmap.josm.tools.I18n;
import org.xnap.commons.i18n.I18nFactory;

public class TranslationLoader_de {

    public TranslationLoader_de() throws Exception {
        Class<?> c = Class.forName("org.openstreetmap.josm.Translation_de");
        Locale.setDefault(Locale.GERMAN);
        I18n.i18n = I18nFactory.getI18n(c);
    }
}
