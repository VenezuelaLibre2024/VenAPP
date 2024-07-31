.class public final enum Lqd/i;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/z$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/i$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqd/i;",
        ">;",
        "Lcom/google/protobuf/z$c;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqd/i;

.field public static final enum AUTO:Lqd/i;

.field public static final AUTO_VALUE:I = 0x1

.field public static final enum CLICK:Lqd/i;

.field public static final CLICK_VALUE:I = 0x2

.field public static final enum SWIPE:Lqd/i;

.field public static final SWIPE_VALUE:I = 0x3

.field public static final enum UNKNOWN_DISMISS_TYPE:Lqd/i;

.field public static final UNKNOWN_DISMISS_TYPE_VALUE:I

.field private static final internalValueMap:Lcom/google/protobuf/z$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$d<",
            "Lqd/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lqd/i;

    const-string v1, "UNKNOWN_DISMISS_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lqd/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqd/i;->UNKNOWN_DISMISS_TYPE:Lqd/i;

    new-instance v1, Lqd/i;

    const-string v3, "AUTO"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lqd/i;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqd/i;->AUTO:Lqd/i;

    new-instance v3, Lqd/i;

    const-string v5, "CLICK"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lqd/i;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lqd/i;->CLICK:Lqd/i;

    new-instance v5, Lqd/i;

    const-string v7, "SWIPE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lqd/i;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lqd/i;->SWIPE:Lqd/i;

    const/4 v7, 0x4

    new-array v7, v7, [Lqd/i;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lqd/i;->$VALUES:[Lqd/i;

    new-instance v0, Lqd/i$a;

    invoke-direct {v0}, Lqd/i$a;-><init>()V

    sput-object v0, Lqd/i;->internalValueMap:Lcom/google/protobuf/z$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lqd/i;->value:I

    return-void
.end method

.method public static b(I)Lqd/i;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lqd/i;->SWIPE:Lqd/i;

    return-object p0

    :cond_1
    sget-object p0, Lqd/i;->CLICK:Lqd/i;

    return-object p0

    :cond_2
    sget-object p0, Lqd/i;->AUTO:Lqd/i;

    return-object p0

    :cond_3
    sget-object p0, Lqd/i;->UNKNOWN_DISMISS_TYPE:Lqd/i;

    return-object p0
.end method

.method public static h()Lcom/google/protobuf/z$e;
    .locals 1

    sget-object v0, Lqd/i$b;->a:Lcom/google/protobuf/z$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqd/i;
    .locals 1

    const-class v0, Lqd/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqd/i;

    return-object p0
.end method

.method public static values()[Lqd/i;
    .locals 1

    sget-object v0, Lqd/i;->$VALUES:[Lqd/i;

    invoke-virtual {v0}, [Lqd/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqd/i;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lqd/i;->value:I

    return v0
.end method
