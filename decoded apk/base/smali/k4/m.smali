.class public final enum Lk4/m;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk4/m$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk4/m;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lk4/m;

.field public static final enum AD_TYPE:Lk4/m;

.field public static final enum CONTENTS:Lk4/m;

.field public static final enum CONTENT_IDS:Lk4/m;

.field public static final enum CONTENT_TYPE:Lk4/m;

.field public static final enum CURRENCY:Lk4/m;

.field public static final Companion:Lk4/m$a;

.field public static final enum DESCRIPTION:Lk4/m;

.field public static final enum EVENT_NAME:Lk4/m;

.field public static final enum EVENT_TIME:Lk4/m;

.field public static final enum LEVEL:Lk4/m;

.field public static final enum MAX_RATING_VALUE:Lk4/m;

.field public static final enum NUM_ITEMS:Lk4/m;

.field public static final enum ORDER_ID:Lk4/m;

.field public static final enum PAYMENT_INFO_AVAILABLE:Lk4/m;

.field public static final enum REGISTRATION_METHOD:Lk4/m;

.field public static final enum SEARCH_STRING:Lk4/m;

.field public static final enum SUCCESS:Lk4/m;

.field public static final enum VALUE_TO_SUM:Lk4/m;


# instance fields
.field private final rawValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk4/m;

    const/4 v1, 0x0

    const-string v2, "_logTime"

    const-string v3, "EVENT_TIME"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->EVENT_TIME:Lk4/m;

    new-instance v0, Lk4/m;

    const/4 v1, 0x1

    const-string v2, "_eventName"

    const-string v3, "EVENT_NAME"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->EVENT_NAME:Lk4/m;

    new-instance v0, Lk4/m;

    const/4 v1, 0x2

    const-string v2, "_valueToSum"

    const-string v3, "VALUE_TO_SUM"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->VALUE_TO_SUM:Lk4/m;

    new-instance v0, Lk4/m;

    const/4 v1, 0x3

    const-string v2, "fb_content_id"

    const-string v3, "CONTENT_IDS"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->CONTENT_IDS:Lk4/m;

    new-instance v0, Lk4/m;

    const/4 v1, 0x4

    const-string v2, "fb_content"

    const-string v3, "CONTENTS"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->CONTENTS:Lk4/m;

    new-instance v0, Lk4/m;

    const/4 v1, 0x5

    const-string v2, "fb_content_type"

    const-string v3, "CONTENT_TYPE"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->CONTENT_TYPE:Lk4/m;

    new-instance v0, Lk4/m;

    const/4 v1, 0x6

    const-string v2, "fb_description"

    const-string v3, "DESCRIPTION"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->DESCRIPTION:Lk4/m;

    new-instance v0, Lk4/m;

    const/4 v1, 0x7

    const-string v2, "fb_level"

    const-string v3, "LEVEL"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->LEVEL:Lk4/m;

    new-instance v0, Lk4/m;

    const/16 v1, 0x8

    const-string v2, "fb_max_rating_value"

    const-string v3, "MAX_RATING_VALUE"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->MAX_RATING_VALUE:Lk4/m;

    new-instance v0, Lk4/m;

    const/16 v1, 0x9

    const-string v2, "fb_num_items"

    const-string v3, "NUM_ITEMS"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->NUM_ITEMS:Lk4/m;

    new-instance v0, Lk4/m;

    const/16 v1, 0xa

    const-string v2, "fb_payment_info_available"

    const-string v3, "PAYMENT_INFO_AVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->PAYMENT_INFO_AVAILABLE:Lk4/m;

    new-instance v0, Lk4/m;

    const/16 v1, 0xb

    const-string v2, "fb_registration_method"

    const-string v3, "REGISTRATION_METHOD"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->REGISTRATION_METHOD:Lk4/m;

    new-instance v0, Lk4/m;

    const/16 v1, 0xc

    const-string v2, "fb_search_string"

    const-string v3, "SEARCH_STRING"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->SEARCH_STRING:Lk4/m;

    new-instance v0, Lk4/m;

    const/16 v1, 0xd

    const-string v2, "fb_success"

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->SUCCESS:Lk4/m;

    new-instance v0, Lk4/m;

    const/16 v1, 0xe

    const-string v2, "fb_order_id"

    const-string v3, "ORDER_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->ORDER_ID:Lk4/m;

    new-instance v0, Lk4/m;

    const/16 v1, 0xf

    const-string v2, "ad_type"

    const-string v3, "AD_TYPE"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->AD_TYPE:Lk4/m;

    new-instance v0, Lk4/m;

    const/16 v1, 0x10

    const-string v2, "fb_currency"

    const-string v3, "CURRENCY"

    invoke-direct {v0, v3, v1, v2}, Lk4/m;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/m;->CURRENCY:Lk4/m;

    invoke-static {}, Lk4/m;->b()[Lk4/m;

    move-result-object v0

    sput-object v0, Lk4/m;->$VALUES:[Lk4/m;

    new-instance v0, Lk4/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk4/m$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lk4/m;->Companion:Lk4/m$a;

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

    iput-object p3, p0, Lk4/m;->rawValue:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lk4/m;
    .locals 3

    const/16 v0, 0x11

    new-array v0, v0, [Lk4/m;

    const/4 v1, 0x0

    sget-object v2, Lk4/m;->EVENT_TIME:Lk4/m;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lk4/m;->EVENT_NAME:Lk4/m;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lk4/m;->VALUE_TO_SUM:Lk4/m;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lk4/m;->CONTENT_IDS:Lk4/m;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lk4/m;->CONTENTS:Lk4/m;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lk4/m;->CONTENT_TYPE:Lk4/m;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lk4/m;->DESCRIPTION:Lk4/m;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lk4/m;->LEVEL:Lk4/m;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lk4/m;->MAX_RATING_VALUE:Lk4/m;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lk4/m;->NUM_ITEMS:Lk4/m;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lk4/m;->PAYMENT_INFO_AVAILABLE:Lk4/m;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lk4/m;->REGISTRATION_METHOD:Lk4/m;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lk4/m;->SEARCH_STRING:Lk4/m;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lk4/m;->SUCCESS:Lk4/m;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lk4/m;->ORDER_ID:Lk4/m;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lk4/m;->AD_TYPE:Lk4/m;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lk4/m;->CURRENCY:Lk4/m;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk4/m;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lk4/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk4/m;

    return-object p0
.end method

.method public static values()[Lk4/m;
    .locals 2

    sget-object v0, Lk4/m;->$VALUES:[Lk4/m;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk4/m;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk4/m;->rawValue:Ljava/lang/String;

    return-object v0
.end method
