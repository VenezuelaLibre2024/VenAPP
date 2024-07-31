.class public final enum Lk4/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk4/i;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lk4/i;

.field public static final enum AD_TYPE:Lk4/i;

.field public static final enum CONTENTS:Lk4/i;

.field public static final enum CONTENT_IDS:Lk4/i;

.field public static final enum CONTENT_TYPE:Lk4/i;

.field public static final enum CURRENCY:Lk4/i;

.field public static final enum DESCRIPTION:Lk4/i;

.field public static final enum EVENT_NAME:Lk4/i;

.field public static final enum EVENT_TIME:Lk4/i;

.field public static final enum LEVEL:Lk4/i;

.field public static final enum MAX_RATING_VALUE:Lk4/i;

.field public static final enum NUM_ITEMS:Lk4/i;

.field public static final enum ORDER_ID:Lk4/i;

.field public static final enum PAYMENT_INFO_AVAILABLE:Lk4/i;

.field public static final enum REGISTRATION_METHOD:Lk4/i;

.field public static final enum SEARCH_STRING:Lk4/i;

.field public static final enum SUCCESS:Lk4/i;

.field public static final enum VALUE_TO_SUM:Lk4/i;


# instance fields
.field private final rawValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk4/i;

    const/4 v1, 0x0

    const-string v2, "value"

    const-string v3, "VALUE_TO_SUM"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->VALUE_TO_SUM:Lk4/i;

    new-instance v0, Lk4/i;

    const/4 v1, 0x1

    const-string v2, "event_time"

    const-string v3, "EVENT_TIME"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->EVENT_TIME:Lk4/i;

    new-instance v0, Lk4/i;

    const/4 v1, 0x2

    const-string v2, "event_name"

    const-string v3, "EVENT_NAME"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->EVENT_NAME:Lk4/i;

    new-instance v0, Lk4/i;

    const/4 v1, 0x3

    const-string v2, "content_ids"

    const-string v3, "CONTENT_IDS"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->CONTENT_IDS:Lk4/i;

    new-instance v0, Lk4/i;

    const/4 v1, 0x4

    const-string v2, "contents"

    const-string v3, "CONTENTS"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->CONTENTS:Lk4/i;

    new-instance v0, Lk4/i;

    const/4 v1, 0x5

    const-string v2, "content_type"

    const-string v3, "CONTENT_TYPE"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->CONTENT_TYPE:Lk4/i;

    new-instance v0, Lk4/i;

    const/4 v1, 0x6

    const-string v2, "description"

    const-string v3, "DESCRIPTION"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->DESCRIPTION:Lk4/i;

    new-instance v0, Lk4/i;

    const/4 v1, 0x7

    const-string v2, "level"

    const-string v3, "LEVEL"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->LEVEL:Lk4/i;

    new-instance v0, Lk4/i;

    const/16 v1, 0x8

    const-string v2, "max_rating_value"

    const-string v3, "MAX_RATING_VALUE"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->MAX_RATING_VALUE:Lk4/i;

    new-instance v0, Lk4/i;

    const/16 v1, 0x9

    const-string v2, "num_items"

    const-string v3, "NUM_ITEMS"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->NUM_ITEMS:Lk4/i;

    new-instance v0, Lk4/i;

    const/16 v1, 0xa

    const-string v2, "payment_info_available"

    const-string v3, "PAYMENT_INFO_AVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->PAYMENT_INFO_AVAILABLE:Lk4/i;

    new-instance v0, Lk4/i;

    const/16 v1, 0xb

    const-string v2, "registration_method"

    const-string v3, "REGISTRATION_METHOD"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->REGISTRATION_METHOD:Lk4/i;

    new-instance v0, Lk4/i;

    const/16 v1, 0xc

    const-string v2, "search_string"

    const-string v3, "SEARCH_STRING"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->SEARCH_STRING:Lk4/i;

    new-instance v0, Lk4/i;

    const/16 v1, 0xd

    const-string v2, "success"

    const-string v3, "SUCCESS"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->SUCCESS:Lk4/i;

    new-instance v0, Lk4/i;

    const/16 v1, 0xe

    const-string v2, "order_id"

    const-string v3, "ORDER_ID"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->ORDER_ID:Lk4/i;

    new-instance v0, Lk4/i;

    const/16 v1, 0xf

    const-string v2, "ad_type"

    const-string v3, "AD_TYPE"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->AD_TYPE:Lk4/i;

    new-instance v0, Lk4/i;

    const/16 v1, 0x10

    const-string v2, "currency"

    const-string v3, "CURRENCY"

    invoke-direct {v0, v3, v1, v2}, Lk4/i;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lk4/i;->CURRENCY:Lk4/i;

    invoke-static {}, Lk4/i;->b()[Lk4/i;

    move-result-object v0

    sput-object v0, Lk4/i;->$VALUES:[Lk4/i;

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

    iput-object p3, p0, Lk4/i;->rawValue:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lk4/i;
    .locals 3

    const/16 v0, 0x11

    new-array v0, v0, [Lk4/i;

    const/4 v1, 0x0

    sget-object v2, Lk4/i;->VALUE_TO_SUM:Lk4/i;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lk4/i;->EVENT_TIME:Lk4/i;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lk4/i;->EVENT_NAME:Lk4/i;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lk4/i;->CONTENT_IDS:Lk4/i;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lk4/i;->CONTENTS:Lk4/i;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lk4/i;->CONTENT_TYPE:Lk4/i;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lk4/i;->DESCRIPTION:Lk4/i;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lk4/i;->LEVEL:Lk4/i;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lk4/i;->MAX_RATING_VALUE:Lk4/i;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lk4/i;->NUM_ITEMS:Lk4/i;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lk4/i;->PAYMENT_INFO_AVAILABLE:Lk4/i;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lk4/i;->REGISTRATION_METHOD:Lk4/i;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lk4/i;->SEARCH_STRING:Lk4/i;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lk4/i;->SUCCESS:Lk4/i;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lk4/i;->ORDER_ID:Lk4/i;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lk4/i;->AD_TYPE:Lk4/i;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lk4/i;->CURRENCY:Lk4/i;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk4/i;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lk4/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk4/i;

    return-object p0
.end method

.method public static values()[Lk4/i;
    .locals 2

    sget-object v0, Lk4/i;->$VALUES:[Lk4/i;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk4/i;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk4/i;->rawValue:Ljava/lang/String;

    return-object v0
.end method
