package org.jluc.dive.deco.model;

import java.io.Serializable;

/**
 * Classe decrivant un exercice de plongee.
 * 
 * @author JLuc
 *
 */
public class Exercice implements Serializable {

    /**
     * Serial Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Type d'exercice.
     */
    private TypeExercice mType;

    /**
     * Premiere plongee de l'exercice.
     */
    private Plongee mPlongee1;

    /**
     * Deuxieme plongee de l'exercice (null si le type d'exercice est
     * PLONGEE_SIMPLE.
     */
    private Plongee mPlongee2;

    /**
     * Date de depart en ms depuis le 1/01/1970.
     */
    private long mDateDepartMS;

    /**
     * Intervalle surface en minutes.
     */
    private long mIntervalleSurface;

    /**
     * Constructeur par defaut.
     */
    public Exercice() {
        mDateDepartMS = System.currentTimeMillis();
        mType = TypeExercice.PLONGEE_SIMPLE;
        mIntervalleSurface = 0;
        mPlongee1 = new Plongee();
    }

    /**
     * @return le Type d'exercice.
     */
    public final TypeExercice getType() {
        return mType;
    }

    /**
     * @param type
     *            le nouveau type d'exercice
     */
    public final void setType(final TypeExercice type) {
        this.mType = type;
    }

    /**
     * @return la premiere plongee.
     */
    public final Plongee getPlongee1() {
        return mPlongee1;
    }

    /**
     * @param plongee
     *            la nouvelle premiere plongee.
     */
    public final void setPlongee1(final Plongee plongee) {
        this.mPlongee1 = plongee;
    }

    /**
     * @return la deuxieme plongee.
     */
    public final Plongee getPlongee2() {
        return mPlongee2;
    }

    /**
     * @param plongee
     *            la nouvelle deuxieme plongee.
     */
    public final void setPlongee2(final Plongee plongee) {
        this.mPlongee2 = plongee;
    }

    /**
     * @return Date de depart
     */
    public final long getDateDepartMS() {
        return mDateDepartMS;
    }

    /**
     * @param dateDepartMS
     *            la nouvelle date de départ.
     */
    public final void setDateDepartMS(final long dateDepartMS) {
        this.mDateDepartMS = dateDepartMS;
    }

    /**
     * @return l'Intervalle Surface.
     */
    public final long getIntervalleSurface() {
        return mIntervalleSurface;
    }

    /**
     * @param intervalleSurface
     *            le nouvel intervalle surface.
     */
    public final void setIntervalleSurface(final long intervalleSurface) {
        this.mIntervalleSurface = intervalleSurface;
    }

}
