.class public final enum Lk4/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk4/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk4/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lk4/b;

.field public static final enum ADVERTISER_ID:Lk4/b;

.field public static final enum ADV_TE:Lk4/b;

.field public static final enum ANON_ID:Lk4/b;

.field public static final enum APP_TE:Lk4/b;

.field public static final enum APP_USER_ID:Lk4/b;

.field public static final enum CONSIDER_VIEWS:Lk4/b;

.field public static final Companion:Lk4/b$a;

.field public static final enum DEVICE_TOKEN:Lk4/b;

.field public static final enum EXT_INFO:Lk4/b;

.field public static final enum INCLUDE_DWELL_DATA:Lk4/b;

.field public static final enum INCLUDE_VIDEO_DATA:Lk4/b;

.field public static final enum INSTALLER_PACKAGE:Lk4/b;

.field public static final enum INSTALL_REFERRER:Lk4/b;

.field public static final enum PAGE_ID:Lk4/b;

.field public static final enum PAGE_SCOPED_USER_ID:Lk4/b;

.field public static final enum RECEIPT_DATA:Lk4/b;

.field public static final enum URL_SCHEMES:Lk4/b;

.field public static final enum USER_DATA:Lk4/b;


# instance fields
.field private final rawValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk4/b;

    const/4 v1, 0x0

    const-string v2, "anon_id"

    const-string v3, "ANON_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->ANON_ID:Lk4/b;

    new-instance v0, Lk4/b;

    const/4 v1, 0x1

    const-string v2, "app_user_id"

    const-string v3, "APP_USER_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->APP_USER_ID:Lk4/b;

    new-instance v0, Lk4/b;

    const/4 v1, 0x2

    const-string v2, "advertiser_id"

    const-string v3, "ADVERTISER_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->ADVERTISER_ID:Lk4/b;

    new-instance v0, Lk4/b;

    const/4 v1, 0x3

    const-string v2, "page_id"

    const-string v3, "PAGE_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->PAGE_ID:Lk4/b;

    new-instance v0, Lk4/b;

    const/4 v1, 0x4

    const-string v2, "page_scoped_user_id"

    const-string v3, "PAGE_SCOPED_USER_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->PAGE_SCOPED_USER_ID:Lk4/b;

    new-instance v0, Lk4/b;

    const/4 v1, 0x5

    const-string v2, "ud"

    const-string v3, "USER_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->USER_DATA:Lk4/b;

    new-instance v0, Lk4/b;

    const/4 v1, 0x6

    const-string v2, "advertiser_tracking_enabled"

    const-string v3, "ADV_TE"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->ADV_TE:Lk4/b;

    new-instance v0, Lk4/b;

    const/4 v1, 0x7

    const-string v2, "application_tracking_enabled"

    const-string v3, "APP_TE"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->APP_TE:Lk4/b;

    new-instance v0, Lk4/b;

    const/16 v1, 0x8

    const-string v2, "consider_views"

    const-string v3, "CONSIDER_VIEWS"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->CONSIDER_VIEWS:Lk4/b;

    new-instance v0, Lk4/b;

    const/16 v1, 0x9

    const-string v2, "device_token"

    const-string v3, "DEVICE_TOKEN"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->DEVICE_TOKEN:Lk4/b;

    new-instance v0, Lk4/b;

    const/16 v1, 0xa

    const-string v2, "extInfo"

    const-string v3, "EXT_INFO"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->EXT_INFO:Lk4/b;

    new-instance v0, Lk4/b;

    const/16 v1, 0xb

    const-string v2, "include_dwell_data"

    const-string v3, "INCLUDE_DWELL_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->INCLUDE_DWELL_DATA:Lk4/b;

    new-instance v0, Lk4/b;

    const/16 v1, 0xc

    const-string v2, "include_video_data"

    const-string v3, "INCLUDE_VIDEO_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->INCLUDE_VIDEO_DATA:Lk4/b;

    new-instance v0, Lk4/b;

    const/16 v1, 0xd

    const-string v2, "install_referrer"

    const-string v3, "INSTALL_REFERRER"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->INSTALL_REFERRER:Lk4/b;

    new-instance v0, Lk4/b;

    const/16 v1, 0xe

    const-string v2, "installer_package"

    const-string v3, "INSTALLER_PACKAGE"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->INSTALLER_PACKAGE:Lk4/b;

    new-instance v0, Lk4/b;

    const/16 v1, 0xf

    const-string v2, "receipt_data"

    const-string v3, "RECEIPT_DATA"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->RECEIPT_DATA:Lk4/b;

    new-instance v0, Lk4/b;

    const/16 v1, 0x10

    const-string v2, "url_schemes"

    const-string v3, "URL_SCHEMES"

    invoke-direct {v0, v3, v1, v2}, Lk4/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/b;->URL_SCHEMES:Lk4/b;

    invoke-static {}, Lk4/b;->b()[Lk4/b;

    move-result-object v0

    sput-object v0, Lk4/b;->$VALUES:[Lk4/b;

    new-instance v0, Lk4/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk4/b$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lk4/b;->Companion:Lk4/b$a;

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

    iput-object p3, p0, Lk4/b;->rawValue:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lk4/b;
    .locals 3

    const/16 v0, 0x11

    new-array v0, v0, [Lk4/b;

    const/4 v1, 0x0

    sget-object v2, Lk4/b;->ANON_ID:Lk4/b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lk4/b;->APP_USER_ID:Lk4/b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lk4/b;->ADVERTISER_ID:Lk4/b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lk4/b;->PAGE_ID:Lk4/b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lk4/b;->PAGE_SCOPED_USER_ID:Lk4/b;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lk4/b;->USER_DATA:Lk4/b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lk4/b;->ADV_TE:Lk4/b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lk4/b;->APP_TE:Lk4/b;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lk4/b;->CONSIDER_VIEWS:Lk4/b;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lk4/b;->DEVICE_TOKEN:Lk4/b;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lk4/b;->EXT_INFO:Lk4/b;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lk4/b;->INCLUDE_DWELL_DATA:Lk4/b;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lk4/b;->INCLUDE_VIDEO_DATA:Lk4/b;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lk4/b;->INSTALL_REFERRER:Lk4/b;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lk4/b;->INSTALLER_PACKAGE:Lk4/b;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lk4/b;->RECEIPT_DATA:Lk4/b;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lk4/b;->URL_SCHEMES:Lk4/b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk4/b;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lk4/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk4/b;

    return-object p0
.end method

.method public static values()[Lk4/b;
    .locals 2

    sget-object v0, Lk4/b;->$VALUES:[Lk4/b;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk4/b;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk4/b;->rawValue:Ljava/lang/String;

    return-object v0
.end method
