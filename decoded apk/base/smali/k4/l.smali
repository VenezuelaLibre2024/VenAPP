.class public final enum Lk4/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk4/l;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lk4/l;

.field public static final enum ADV_TE:Lk4/l;

.field public static final enum ANON_ID:Lk4/l;

.field public static final enum APP_TE:Lk4/l;

.field public static final enum CONSIDER_VIEWS:Lk4/l;

.field public static final enum DEVICE_TOKEN:Lk4/l;

.field public static final enum EXT_INFO:Lk4/l;

.field public static final enum FB_LOGIN_ID:Lk4/l;

.field public static final enum INCLUDE_DWELL_DATA:Lk4/l;

.field public static final enum INCLUDE_VIDEO_DATA:Lk4/l;

.field public static final enum INSTALLER_PACKAGE:Lk4/l;

.field public static final enum INSTALL_REFERRER:Lk4/l;

.field public static final enum MAD_ID:Lk4/l;

.field public static final enum PAGE_ID:Lk4/l;

.field public static final enum PAGE_SCOPED_USER_ID:Lk4/l;

.field public static final enum RECEIPT_DATA:Lk4/l;

.field public static final enum URL_SCHEMES:Lk4/l;

.field public static final enum USER_DATA:Lk4/l;


# instance fields
.field private final rawValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk4/l;

    const/4 v1, 0x0

    const-string v2, "anon_id"

    const-string v3, "ANON_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->ANON_ID:Lk4/l;

    new-instance v0, Lk4/l;

    const/4 v1, 0x1

    const-string v2, "fb_login_id"

    const-string v3, "FB_LOGIN_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->FB_LOGIN_ID:Lk4/l;

    new-instance v0, Lk4/l;

    const/4 v1, 0x2

    const-string v2, "madid"

    const-string v3, "MAD_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->MAD_ID:Lk4/l;

    new-instance v0, Lk4/l;

    const/4 v1, 0x3

    const-string v2, "page_id"

    const-string v3, "PAGE_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->PAGE_ID:Lk4/l;

    new-instance v0, Lk4/l;

    const/4 v1, 0x4

    const-string v2, "page_scoped_user_id"

    const-string v3, "PAGE_SCOPED_USER_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->PAGE_SCOPED_USER_ID:Lk4/l;

    new-instance v0, Lk4/l;

    const/4 v1, 0x5

    const-string v2, "ud"

    const-string v3, "USER_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->USER_DATA:Lk4/l;

    new-instance v0, Lk4/l;

    const/4 v1, 0x6

    const-string v2, "advertiser_tracking_enabled"

    const-string v3, "ADV_TE"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->ADV_TE:Lk4/l;

    new-instance v0, Lk4/l;

    const/4 v1, 0x7

    const-string v2, "application_tracking_enabled"

    const-string v3, "APP_TE"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->APP_TE:Lk4/l;

    new-instance v0, Lk4/l;

    const/16 v1, 0x8

    const-string v2, "consider_views"

    const-string v3, "CONSIDER_VIEWS"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->CONSIDER_VIEWS:Lk4/l;

    new-instance v0, Lk4/l;

    const/16 v1, 0x9

    const-string v2, "device_token"

    const-string v3, "DEVICE_TOKEN"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->DEVICE_TOKEN:Lk4/l;

    new-instance v0, Lk4/l;

    const/16 v1, 0xa

    const-string v2, "extInfo"

    const-string v3, "EXT_INFO"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->EXT_INFO:Lk4/l;

    new-instance v0, Lk4/l;

    const/16 v1, 0xb

    const-string v2, "include_dwell_data"

    const-string v3, "INCLUDE_DWELL_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->INCLUDE_DWELL_DATA:Lk4/l;

    new-instance v0, Lk4/l;

    const/16 v1, 0xc

    const-string v2, "include_video_data"

    const-string v3, "INCLUDE_VIDEO_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->INCLUDE_VIDEO_DATA:Lk4/l;

    new-instance v0, Lk4/l;

    const/16 v1, 0xd

    const-string v2, "install_referrer"

    const-string v3, "INSTALL_REFERRER"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->INSTALL_REFERRER:Lk4/l;

    new-instance v0, Lk4/l;

    const/16 v1, 0xe

    const-string v2, "installer_package"

    const-string v3, "INSTALLER_PACKAGE"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->INSTALLER_PACKAGE:Lk4/l;

    new-instance v0, Lk4/l;

    const/16 v1, 0xf

    const-string v2, "receipt_data"

    const-string v3, "RECEIPT_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->RECEIPT_DATA:Lk4/l;

    new-instance v0, Lk4/l;

    const/16 v1, 0x10

    const-string v2, "url_schemes"

    const-string v3, "URL_SCHEMES"

    invoke-direct {v0, v3, v1, v2}, Lk4/l;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/l;->URL_SCHEMES:Lk4/l;

    invoke-static {}, Lk4/l;->b()[Lk4/l;

    move-result-object v0

    sput-object v0, Lk4/l;->$VALUES:[Lk4/l;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lk4/l;->rawValue:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lk4/l;
    .locals 3

    const/16 v0, 0x11

    new-array v0, v0, [Lk4/l;

    const/4 v1, 0x0

    sget-object v2, Lk4/l;->ANON_ID:Lk4/l;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lk4/l;->FB_LOGIN_ID:Lk4/l;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lk4/l;->MAD_ID:Lk4/l;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lk4/l;->PAGE_ID:Lk4/l;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lk4/l;->PAGE_SCOPED_USER_ID:Lk4/l;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lk4/l;->USER_DATA:Lk4/l;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lk4/l;->ADV_TE:Lk4/l;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lk4/l;->APP_TE:Lk4/l;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lk4/l;->CONSIDER_VIEWS:Lk4/l;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lk4/l;->DEVICE_TOKEN:Lk4/l;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lk4/l;->EXT_INFO:Lk4/l;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lk4/l;->INCLUDE_DWELL_DATA:Lk4/l;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lk4/l;->INCLUDE_VIDEO_DATA:Lk4/l;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lk4/l;->INSTALL_REFERRER:Lk4/l;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lk4/l;->INSTALLER_PACKAGE:Lk4/l;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lk4/l;->RECEIPT_DATA:Lk4/l;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lk4/l;->URL_SCHEMES:Lk4/l;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk4/l;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lk4/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk4/l;

    return-object p0
.end method

.method public static values()[Lk4/l;
    .locals 2

    sget-object v0, Lk4/l;->$VALUES:[Lk4/l;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk4/l;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk4/l;->rawValue:Ljava/lang/String;

    return-object v0
.end method
