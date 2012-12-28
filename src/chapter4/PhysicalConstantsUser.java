package chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: rnarasimhan
 * Date: 12/27/12
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */

//Use of static import to avoid qualifying constants

import static chapter4.PhysicalConstants.AVOGADROS_NUMBER;

public class PhysicalConstantsUser {

    double atoms (double mols)
    {
        return AVOGADROS_NUMBER * mols;
    }
}
