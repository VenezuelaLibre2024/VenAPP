.class public final enum Li4/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li4/h;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Li4/h;

.field public static final enum CHROME_CUSTOM_TAB:Li4/h;

.field public static final enum CLIENT_TOKEN:Li4/h;

.field public static final enum DEVICE_AUTH:Li4/h;

.field public static final enum FACEBOOK_APPLICATION_NATIVE:Li4/h;

.field public static final enum FACEBOOK_APPLICATION_SERVICE:Li4/h;

.field public static final enum FACEBOOK_APPLICATION_WEB:Li4/h;

.field public static final enum INSTAGRAM_APPLICATION_WEB:Li4/h;

.field public static final enum INSTAGRAM_CUSTOM_CHROME_TAB:Li4/h;

.field public static final enum INSTAGRAM_WEB_VIEW:Li4/h;

.field public static final enum NONE:Li4/h;

.field public static final enum TEST_USER:Li4/h;

.field public static final enum WEB_VIEW:Li4/h;


# instance fields
.field private final canExtendToken:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Li4/h;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->NONE:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "FACEBOOK_APPLICATION_WEB"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->FACEBOOK_APPLICATION_WEB:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "FACEBOOK_APPLICATION_NATIVE"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->FACEBOOK_APPLICATION_NATIVE:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "FACEBOOK_APPLICATION_SERVICE"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v3, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->FACEBOOK_APPLICATION_SERVICE:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "WEB_VIEW"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v3, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->WEB_VIEW:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "CHROME_CUSTOM_TAB"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v3, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->CHROME_CUSTOM_TAB:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "TEST_USER"

    const/4 v3, 0x6

    invoke-direct {v0, v1, v3, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->TEST_USER:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "CLIENT_TOKEN"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v3, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->CLIENT_TOKEN:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "DEVICE_AUTH"

    const/16 v3, 0x8

    invoke-direct {v0, v1, v3, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->DEVICE_AUTH:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "INSTAGRAM_APPLICATION_WEB"

    const/16 v3, 0x9

    invoke-direct {v0, v1, v3, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->INSTAGRAM_APPLICATION_WEB:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "INSTAGRAM_CUSTOM_CHROME_TAB"

    const/16 v3, 0xa

    invoke-direct {v0, v1, v3, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->INSTAGRAM_CUSTOM_CHROME_TAB:Li4/h;

    new-instance v0, Li4/h;

    const-string v1, "INSTAGRAM_WEB_VIEW"

    const/16 v3, 0xb

    invoke-direct {v0, v1, v3, v2}, Li4/h;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, Li4/h;->INSTAGRAM_WEB_VIEW:Li4/h;

    invoke-static {}, Li4/h;->b()[Li4/h;

    move-result-object v0

    sput-object v0, Li4/h;->$VALUES:[Li4/h;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Li4/h;->canExtendToken:Z

    return-void
.end method

.method private static final synthetic b()[Li4/h;
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [Li4/h;

    const/4 v1, 0x0

    sget-object v2, Li4/h;->NONE:Li4/h;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Li4/h;->FACEBOOK_APPLICATION_WEB:Li4/h;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Li4/h;->FACEBOOK_APPLICATION_NATIVE:Li4/h;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Li4/h;->FACEBOOK_APPLICATION_SERVICE:Li4/h;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Li4/h;->WEB_VIEW:Li4/h;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Li4/h;->CHROME_CUSTOM_TAB:Li4/h;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Li4/h;->TEST_USER:Li4/h;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Li4/h;->CLIENT_TOKEN:Li4/h;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Li4/h;->DEVICE_AUTH:Li4/h;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Li4/h;->INSTAGRAM_APPLICATION_WEB:Li4/h;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Li4/h;->INSTAGRAM_CUSTOM_CHROME_TAB:Li4/h;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Li4/h;->INSTAGRAM_WEB_VIEW:Li4/h;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Li4/h;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Li4/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li4/h;

    return-object p0
.end method

.method public static values()[Li4/h;
    .locals 2

    sget-object v0, Li4/h;->$VALUES:[Li4/h;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li4/h;

    return-object v0
.end method


# virtual methods
.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Li4/h;->canExtendToken:Z

    return v0
.end method
