/*
  ���� Java(J2SE1.4) �p�j������R�[�h�́A���L�E�F�u�T�C�g��
  ���J����Ă����VBA�p�̃R�[�h�����ɁA���Javascript�ł�
  C����ł��Q�l�ɂ���
  ���g �h��( ttp://www.age.ne.jp/x/abiru/index.html )��
  �ҏW�ڐA���܂����B
*/

/*_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
_/
_/�@CopyRight(C) K.Tsunoda(AddinBox) 2001 All Rights Reserved.
_/�@( http://www.h3.dion.ne.jp/~sakatsu/index.htm )
_/
_/�@�@���̏j���}�N���́wkt�֐��A�h�C���x�Ŏg�p���Ă�����̂ł��B
_/�@�@���̃��W�b�N�́A���X�|���X����`�Ƃ��āA�\�Ȍ��菭�Ȃ�
_/�@�y��������̎��s�z�Ō��ʂ��o����悤�ɐ݌v���Ă���܂��B
_/�@�@���̊֐��ł́A�Q�O�O�R�N�{�s�̉����j���@�܂ł��T�|�[�g����
_/�@���܂�(�X���̍����̋x�����܂�)�B
_/
_/�@(*1)���̃}�N�������p����ɓ������ẮA�K�����̃R�����g��
_/�@�@�@�ꏏ�Ɉ��p���鎖�Ƃ��܂��B
_/�@(*2)���T�C�g��Ŗ{�}�N���𒼐ڈ��p���鎖�́A�������肢�܂��B
_/�@�@�@�y http://www.h3.dion.ne.jp/~sakatsu/holiday_logic.htm �z
_/�@�@�@�ւ̃����N�ɂ��Љ�őΉ����ĉ������B
_/�@(*3)[ktHolidayName]�Ƃ����֐������̂��̂́A�e���̊���
_/�@�@�@�����閽���K���ɉ����ĕύX���Ă��\���܂���B
_/�@
_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/*/


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class KtHoliday{

    private KtHoliday(){
    }

    private static final  Calendar cstImplementTheLawOfHoliday
        = new GregorianCalendar( 1948, Calendar.JULY, 20 );       // �j���@�{�s
    private static final  Calendar cstAkihitoKekkon
        = new GregorianCalendar( 1959, Calendar.APRIL, 10 );  // ���m�e���̌����̋V
    private static final  Calendar cstShowaTaiso
        = new GregorianCalendar( 1989, Calendar.FEBRUARY, 24 );// ���a�V�c��r�̗�
    private static final  Calendar cstNorihitoKekkon
        = new GregorianCalendar( 1993, Calendar.JUNE, 9 );// ���m�e���̌����̋V
    private static final  Calendar cstSokuireiseiden
        = new GregorianCalendar( 1990, Calendar.NOVEMBER, 12 );// ���ʗ琳�a�̋V
    private static final  Calendar cstImplementHoliday
        = new GregorianCalendar( 1973, Calendar.APRIL, 12 );// �U�֋x���{�s

    // [prmDate]�ɂ� "yyyy/m/d"�`���̓��t�������n��
    public static String getHolidayName( String prmDate ) throws ParseException
    {
        String HolidayName_ret = "";
        SimpleDateFormat formatter = new SimpleDateFormat ( "yyyy/MM/dd" );
        Calendar MyDate = Calendar.getInstance();
        MyDate.setTime( formatter.parse( prmDate ) );
        String HolidayName = prvHolidayChk( MyDate );
        if ( HolidayName == "" ) {
            if ( MyDate.get( Calendar.DAY_OF_WEEK ) == Calendar.MONDAY ) {
                // ���j�ȊO�͐U�֋x������s�v
                if ( MyDate.after( cstImplementHoliday ) || MyDate.equals( cstImplementHoliday ) ) {
                    Calendar YesterDay = (Calendar )MyDate.clone();
                    YesterDay.add( Calendar.DATE, -1 );
                    HolidayName = prvHolidayChk( YesterDay );
                    HolidayName_ret = "";
                    if ( HolidayName != "" ) {
                        HolidayName_ret = "�U�֋x��";
                    } else {
                        HolidayName_ret = "";
                    }
                } else {
                    HolidayName_ret = "";
                }
            } else {
                HolidayName_ret = "";
            }
        } else {
            HolidayName_ret = HolidayName;
        }
        return HolidayName_ret;
    }

    //===============================================================

    private static String prvHolidayChk( Calendar MyDate )
    {
        int NumberOfWeek;
        String Result;
        int MyYear = MyDate.get( Calendar.YEAR );
        int MyMonth = MyDate.get( Calendar.MONTH ) + 1;    // MyMonth:1�`12
        int MyDay = MyDate.get( Calendar.DATE );

        if ( MyDate.before( cstImplementTheLawOfHoliday ) ) {
        return ""; // �j���@�{�s(1948/7/20 )�ȑO
        } else;

        Result = "";
        switch ( MyMonth ) {
    // �P�� //
        case 1:
            if ( MyDay == 1 ) {
                Result = "����";
            } else {
                if ( MyYear >= 2000 ) {
                    NumberOfWeek = ( (MyDay - 1 ) / 7 ) + 1;
                    if ( ( NumberOfWeek == 2 ) && ( MyDate.get( Calendar.DAY_OF_WEEK ) == Calendar.MONDAY ) ) {
                        Result = "���l�̓�";
                    } else;
                } else {
                    if ( MyDay == 15 ) {
                        Result = "���l�̓�";
                    } else;
                }
            }
            break;
    // �Q�� //
        case 2:
            if ( MyDay == 11 ) {
                if ( MyYear >= 1967 ) {
                    Result = "�����L�O�̓�";
                } else;
            } else {
                if ( MyDate.equals( cstShowaTaiso ) ) {
                    Result = "���a�V�c�̑�r�̗�";
                } else;
            }
            break;
    // �R�� //
        case 3:
            if ( MyDay == prvDayOfSpringEquinox( MyYear ) ) {  // 1948�`2150�ȊO��[99]
                Result = "�t���̓�";                       // ���Ԃ�̂Ť�K�����ɂȂ�
            } else;
            break;
    // �S�� //
        case 4:
            if ( MyDay == 29 ) {
                if ( MyYear >= 1989 ) {
                    Result = "�݂ǂ�̓�";
                } else {
                Result = "�V�c�a����";
                }
            } else {
                if ( MyDate.equals( cstAkihitoKekkon ) ) {
                    Result = "�c���q���m�e���̌����̋V";// ( =1959/4/10 )
                } else;
            }
            break;
    // �T�� //
        case 5:
            if ( MyDay == 3 ) {
                Result = "���@�L�O��";
            } else {
                if ( MyDay == 4 ) {
                    if ( MyDate.get( Calendar.DAY_OF_WEEK ) > Calendar.MONDAY ) {
                    // 5/4�����j���́w���̓��j�x����j���́w���@�L�O���̐U�֋x���x
                        if ( MyYear >= 1986 ) {
                            Result = "�����̋x��";
                        } else;
                    } else;
                } else {
                    if ( MyDay == 5 ) {
                        Result = "�q���̓�";
                    } else;
                }
            }
            break;
    // �U�� //
        case 6:
            if ( MyDate.equals( cstNorihitoKekkon ) ) {
                Result = "�c���q���m�e���̌����̋V";
            } else;
            break;
    // �V�� //
        case 7:
            if ( MyYear >= 2003 ) {
                NumberOfWeek = ( (MyDay - 1 ) / 7 ) + 1;
                if ( ( NumberOfWeek == 3 ) && ( MyDate.get( Calendar.DAY_OF_WEEK ) == Calendar.MONDAY ) ) {
                    Result = "�C�̓�";
                } else;
            } else {
                if ( MyYear >= 1996 ) {
                    if ( MyDay == 20 ) {
                        Result = "�C�̓�";
                    } else;
                } else;
            }
            break;
    // �X�� //
        case 9:
            //��R���j��( 15�`21 )�ƏH����(22�`24 )���d�Ȃ鎖�͂Ȃ�
            int MyAutumnEquinox = prvDayOfAutumnEquinox( MyYear );
            if ( MyDay == MyAutumnEquinox ) {    // 1948�`2150�ȊO��[99]
                Result = "�H���̓�";           // ���Ԃ�̂Ť�K�����ɂȂ�
            } else {
                if ( MyYear >= 2003 ) {
                    NumberOfWeek = ( (MyDay - 1 ) / 7 ) + 1;
                    if ( (NumberOfWeek == 3 ) && ( MyDate.get( Calendar.DAY_OF_WEEK ) == Calendar.MONDAY ) ) {
                        Result = "�h�V�̓�";
                    } else {
                        if ( MyDate.get( Calendar.DAY_OF_WEEK ) == Calendar.TUESDAY ) {
                            if ( MyDay == ( MyAutumnEquinox - 1 ) ) {
                                Result = "�����̋x��";
                            } else;
                        } else;
                    }
                } else {
                    if ( MyYear >= 1966 ) {
                        if ( MyDay == 15 ) {
                            Result = "�h�V�̓�";
                        } else;
                    } else;
                }
            }
            break;
    // �P�O�� //
        case 10:
            if ( MyYear >= 2000 ) {
                NumberOfWeek = ( ( MyDay - 1 ) / 7 ) + 1;
                if ( (NumberOfWeek == 2 ) && ( MyDate.get( Calendar.DAY_OF_WEEK ) == Calendar.MONDAY ) ) {
                    Result = "�̈�̓�";
                } else;
            } else {
                if ( MyYear >= 1966 ) {
                    if ( MyDay == 10 ) {
                        Result = "�̈�̓�";
                    } else;
                } else;
            }
            break;
    // �P�P�� //
        case 11:
            if ( MyDay == 3 ) {
                Result = "�����̓�";
            } else {
                if ( MyDay == 23 ) {
                    Result = "�ΘJ���ӂ̓�";
                } else {
                    if ( MyDate.equals( cstSokuireiseiden ) ) {
                        Result = "���ʗ琳�a�̋V";
                    } else;
                }
            }
            break;
    // �P�Q�� //
        case 12:
            if ( MyDay == 23 ) {
                if ( MyYear >= 1989 ) {
                    Result = "�V�c�a����";
                } else;
            } else;
            break;
        }

        return Result;
    }

    //===================================================================
    // �t��/�H�����̗��Z����
    // �w�C��ۈ������H�� ��v�Z������� �V����ݕ֗����x
    // �ŏЉ��Ă��鎮�ł��B
    private static int prvDayOfSpringEquinox( int MyYear )
    {
        int SpringEquinox_ret;
        if ( MyYear <= 1947 ) {
            SpringEquinox_ret = 99;    //�j���@�{�s�O
        } else {
            if ( MyYear <= 1979 ) {
                SpringEquinox_ret = (int)( 20.8357 + 
                ( 0.242194 * ( MyYear - 1980 ) ) - (int)( (MyYear - 1983 ) / 4 ) );
            } else {
                if ( MyYear <= 2099 ) {
                    SpringEquinox_ret = (int)( 20.8431 + 
                    ( 0.242194 * ( MyYear - 1980 ) ) - (int)( (MyYear - 1980 ) / 4 ) );
                } else {
                    if ( MyYear <= 2150 ) {
                        SpringEquinox_ret = (int)( 21.851 + 
                        ( 0.242194 * ( MyYear - 1980 ) ) - (int)( (MyYear - 1980 ) / 4 ) );
                    } else {
                        SpringEquinox_ret = 99;    //2151�N�ȍ~�͗��Z���������̂ŕs��
                    }
                }
            }
        }
        return SpringEquinox_ret;
    }

    //=====================================================================
    private static int prvDayOfAutumnEquinox( int MyYear )
    {
        int AutumnEquinox_ret;
        if ( MyYear <= 1947 ) {
            AutumnEquinox_ret = 99; //�j���@�{�s�O
        } else {
            if ( MyYear <= 1979 ) {
                AutumnEquinox_ret = (int)( 23.2588 + 
                ( 0.242194 * ( MyYear - 1980 ) ) - (int)( (MyYear - 1983 ) / 4 ) );
            } else {
                if ( MyYear <= 2099 ) {
                    AutumnEquinox_ret = (int)( 23.2488 + 
                    ( 0.242194 * ( MyYear - 1980 ) ) - (int)( (MyYear - 1980 ) / 4 ) );
                } else {
                    if ( MyYear <= 2150 ) {
                        AutumnEquinox_ret = (int)( 24.2488 + 
                        ( 0.242194 * ( MyYear - 1980 ) ) - (int)( (MyYear - 1980 ) / 4 ) );
                    } else {
                        AutumnEquinox_ret = 99;    //2151�N�ȍ~�͗��Z���������̂ŕs��
                    }
                }
            }
        }
        return AutumnEquinox_ret;
    }


    /*_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
    _/ 
    _/ ���������́A���g�h�ꂪ�Ǝ��ɒǉ������R�[�f�B���O�ł��B
    _/ Thu, 18 Dec 2003 02:25:27 +0900
    _/ abiru@home.104.net
    _/ 
    _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/ */

    //=====================================================================

    /*���̃��\�b�h�́A������java.util.Calendar�����getHolidayName���\�b�h�ł��B
        �P��Calendar�I�u�W�F�N�g����"yyyy/MM/dd"�`���̕������g�ݗ��Ă�
        getHolidayName( String prmDate )�̕��̃��\�b�h���Ăяo���Ă��邾���ł����A
        ���̃A�v���P�[�V�������炱�̃N���X���g�����̂��Ƃ��l�������String
        �ł͂Ȃ��ACalendar�������Ɏ�郁�\�b�h�������������֗��ł���ˁH*/
    public static String getHolidayName( Calendar prmDate ) throws ParseException
    {
        SimpleDateFormat f = new SimpleDateFormat ( "yyyy/MM/dd" );
        return getHolidayName( f.format( prmDate.getTime() ) );
    }

    //=====================================================================

    /*���̃��\�b�h�͓���m�F��f�o�b�O�p�ɗp�ӂ������\�b�h�ł��B
        �ʏ�͗��p���܂���̂ŕs�v�ȏꍇ�ɂ͍폜���Ē����Č��\�ł��B
        �g�����͈ȉ��̒ʂ�ł��B
        java KtHoliday 1948/01/01 2050/12/30
    */
    public static void main( String args[] ) throws Exception
    {
        SimpleDateFormat f = new SimpleDateFormat ( "yyyy/MM/dd" );
        Calendar current = new GregorianCalendar();
        current.setTime( f.parse( args[0] ) );
        Calendar end = new GregorianCalendar();
        end.setTime( f.parse( args[1] ) );

        String result = "";
        while( current.before( end ) || current.equals( end ) ){
            result = getHolidayName( current );
            if( !result.equals( "" ) ){
                System.out.print( f.format( current.getTime() ) );
                System.out.println( ",\"" + result + "\"" );
            }
            current.add( Calendar.DATE , 1 );
        }

    }
}