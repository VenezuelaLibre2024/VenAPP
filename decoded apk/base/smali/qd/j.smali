.class public final enum Lqd/j;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/z$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/j$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqd/j;",
        ">;",
        "Lcom/google/protobuf/z$c;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqd/j;

.field public static final enum CLICK_EVENT_TYPE:Lqd/j;

.field public static final CLICK_EVENT_TYPE_VALUE:I = 0x2

.field public static final enum IMPRESSION_EVENT_TYPE:Lqd/j;

.field public static final IMPRESSION_EVENT_TYPE_VALUE:I = 0x1

.field public static final enum UNKNOWN_EVENT_TYPE:Lqd/j;

.field public static final UNKNOWN_EVENT_TYPE_VALUE:I

.field private static final internalValueMap:Lcom/google/protobuf/z$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$d<",
            "Lqd/j;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lqd/j;

    const-string v1, "UNKNOWN_EVENT_TYPE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lqd/j;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqd/j;->UNKNOWN_EVENT_TYPE:Lqd/j;

    new-instance v1, Lqd/j;

    const-string v3, "IMPRESSION_EVENT_TYPE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lqd/j;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqd/j;->IMPRESSION_EVENT_TYPE:Lqd/j;

    new-instance v3, Lqd/j;

    const-string v5, "CLICK_EVENT_TYPE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lqd/j;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lqd/j;->CLICK_EVENT_TYPE:Lqd/j;

    const/4 v5, 0x3

    new-array v5, v5, [Lqd/j;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lqd/j;->$VALUES:[Lqd/j;

    new-instance v0, Lqd/j$a;

    invoke-direct {v0}, Lqd/j$a;-><init>()V

    sput-object v0, Lqd/j;->internalValueMap:Lcom/google/protobuf/z$d;

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

    iput p3, p0, Lqd/j;->value:I

    return-void
.end method

.method public static b(I)Lqd/j;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lqd/j;->CLICK_EVENT_TYPE:Lqd/j;

    return-object p0

    :cond_1
    sget-object p0, Lqd/j;->IMPRESSION_EVENT_TYPE:Lqd/j;

    return-object p0

    :cond_2
    sget-object p0, Lqd/j;->UNKNOWN_EVENT_TYPE:Lqd/j;

    return-object p0
.end method

.method public static h()Lcom/google/protobuf/z$e;
    .locals 1

    sget-object v0, Lqd/j$b;->a:Lcom/google/protobuf/z$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lqd/j;
    .locals 1

    const-class v0, Lqd/j;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqd/j;

    return-object p0
.end method

.method public static values()[Lqd/j;
    .locals 1

    sget-object v0, Lqd/j;->$VALUES:[Lqd/j;

    invoke-virtual {v0}, [Lqd/j;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqd/j;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lqd/j;->value:I

    return v0
.end method
