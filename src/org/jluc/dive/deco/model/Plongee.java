package org.jluc.dive.deco.model;

import java.io.Serializable;

import org.jluc.dive.deco.dico.DicoDecoComputerConfig;
import org.jluc.tools.resources.Tools;

/**
 * Classe decrivant une plongee.
 * 
 * @author JLuc
 *
 */
public class Plongee implements Serializable {

    /**
     * Profondeur par defaut.
     */
    private static final double PROFONDEUR_PAR_DEFAUT = Tools.getDouble(DicoDecoComputerConfig.INSTANCE,
            DicoDecoComputerConfig.DEFAULT_PROFONDEUR);
    /**
     * Temps de plongee par defaut.
     */
    private static final double TEMPS_PLONGEE_PAR_DEFAUT = Tools.getDouble(DicoDecoComputerConfig.INSTANCE,
            DicoDecoComputerConfig.DEFAULT_TEMPS_PLONGEE);

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Type de remontee.
     */
    private TypeRemontee mTypeRemontee;

    /**
     * Profondeur max.
     */
    private double mProfondeur;

    /**
     * Temps de plongee.
     */
    private double mTempsPlongee;

    /**
     * Constructeur par defaut.
     */
    public Plongee() {
        mTypeRemontee = TypeRemontee.REMONTEE_NORMALE;
        mProfondeur = PROFONDEUR_PAR_DEFAUT;
        mTempsPlongee = TEMPS_PLONGEE_PAR_DEFAUT;
    }

    /**
     * @return le type de remontee.
     */
    public final TypeRemontee getTypeRemontee() {
        return mTypeRemontee;
    }

    /**
     * @param typeRemontee
     *            le nouveau type de remontee.
     */
    public final void setTypeRemontee(final TypeRemontee typeRemontee) {
        this.mTypeRemontee = typeRemontee;
    }

    /**
     * @return la profondeur maximale de la plongee.
     */
    public final double getProfondeur() {
        return mProfondeur;
    }

    /**
     * @param profondeur
     *            la nouvelle profondeur maximale de la plongee.
     */
    public final void setProfondeur(final double profondeur) {
        this.mProfondeur = profondeur;
    }

    /**
     * @return le temps de plongee.
     */
    public final double getTempsPlongee() {
        return mTempsPlongee;
    }

    /**
     * @param tempsPlongee
     *            le nouveau temps de plongee.
     */
    public final void setTempsPlongee(final double tempsPlongee) {
        this.mTempsPlongee = tempsPlongee;
    }
}
