package org.jluc.dive.deco.dico;

import org.jluc.tools.resources.kvfile.api.annotation.Comments;
import org.jluc.tools.resources.kvfile.api.annotation.KeyValueFile;
import org.jluc.tools.resources.kvfile.impl.MandatoryConfigurationBundle;

/**
 * Classe decrivant le fichier de configuration de l'application.
 * 
 * @author JLuc
 *
 */
@KeyValueFile(comments = "Fichier decoComputerConfig.properties", commentsDelimiter = "#", bundle = "resources/decoComputerConfig")
public final class DicoDecoComputerConfig extends MandatoryConfigurationBundle {

    /**
     * Clef de la profondeur par defaut.
     */
    @Comments("Profondeur par défaut.")
    public static final E DEFAULT_PROFONDEUR = new E("default.plongee.profondeur", "20", false);

    /**
     * Clef du temps de plongee par defaut.
     */
    @Comments("Temps de plongée par défaut.")
    public static final E DEFAULT_TEMPS_PLONGEE = new E("default.plongee.temps", "50", false);

    /**
     * Clef du nom de l'application.
     */
    @Comments("Nom de l'application.")
    public static final E APPLICATION_NAME = new E("application.name", "Deco Computer", false);

    /**
     * Clef de la version de l'application.
     */
    @Comments("Version de l'application.")
    public static final E APPLICATION_VERSION = new E("application.version", "1.0.0", false);

    /**
     * Clef de la date de l'application.
     */
    @Comments("Date de l'application.")
    public static final E APPLICATION_DATE = new E("application.date", "05/11/2016", false);

    /**
     * Clef de l'auteur de l'application.
     */
    @Comments("Auteur de l'application.")
    public static final E APPLICATION_AUTHOR = new E("application.author", "JLuc ;o)", false);

    /**
     * Clef du fichier de configuration log4j.
     */
    @Comments("Auteur de l'application.")
    public static final E LOG4J_FILE = new E("logging.filename", "resources/log4", false);

    /**
     * Nom du dictionnaire.
     */
    // ATTENTION : toujours déclarer cette variable en dernier car le
    // constructeur de GenericKeyValueFile a besoin que les constantes soient
    // déclarées.
    public static final DicoDecoComputerConfig INSTANCE = new DicoDecoComputerConfig();

    /**
     * Constructeur par defaut.
     */
    private DicoDecoComputerConfig() {

    }

    /**
     * Generation du fichier par defaut.
     * 
     * @param args
     *            Arguments de la ligne de commande
     */
    public static void main(final String[] args) {

        // Dump d'un fichier de valeurs par défaut
        System.out.println(DicoDecoComputerConfig.INSTANCE.getTemplateFileAsString());
    }

}
