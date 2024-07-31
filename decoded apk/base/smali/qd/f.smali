.class public final enum Lqd/f;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/z$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lqd/f;",
        ">;",
        "Lcom/google/protobuf/z$c;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lqd/f;

.field public static final enum APP_LAUNCH:Lqd/f;

.field public static final APP_LAUNCH_VALUE:I = 0x1

.field public static final enum ON_FOREGROUND:Lqd/f;

.field public static final ON_FOREGROUND_VALUE:I = 0x2

.field public static final enum UNKNOWN_TRIGGER:Lqd/f;

.field public static final UNKNOWN_TRIGGER_VALUE:I

.field public static final enum UNRECOGNIZED:Lqd/f;

.field private static final internalValueMap:Lcom/google/protobuf/z$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$d<",
            "Lqd/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lqd/f;

    const-string v1, "UNKNOWN_TRIGGER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lqd/f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lqd/f;->UNKNOWN_TRIGGER:Lqd/f;

    new-instance v1, Lqd/f;

    const-string v3, "APP_LAUNCH"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lqd/f;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lqd/f;->APP_LAUNCH:Lqd/f;

    new-instance v3, Lqd/f;

    const-string v5, "ON_FOREGROUND"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lqd/f;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lqd/f;->ON_FOREGROUND:Lqd/f;

    new-instance v5, Lqd/f;

    const/4 v7, -0x1

    const-string v8, "UNRECOGNIZED"

    const/4 v9, 0x3

    invoke-direct {v5, v8, v9, v7}, Lqd/f;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lqd/f;->UNRECOGNIZED:Lqd/f;

    const/4 v7, 0x4

    new-array v7, v7, [Lqd/f;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v9

    sput-object v7, Lqd/f;->$VALUES:[Lqd/f;

    new-instance v0, Lqd/f$a;

    invoke-direct {v0}, Lqd/f$a;-><init>()V

    sput-object v0, Lqd/f;->internalValueMap:Lcom/google/protobuf/z$d;

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

    iput p3, p0, Lqd/f;->value:I

    return-void
.end method

.method public static b(I)Lqd/f;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lqd/f;->ON_FOREGROUND:Lqd/f;

    return-object p0

    :cond_1
    sget-object p0, Lqd/f;->APP_LAUNCH:Lqd/f;

    return-object p0

    :cond_2
    sget-object p0, Lqd/f;->UNKNOWN_TRIGGER:Lqd/f;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lqd/f;
    .locals 1

    const-class v0, Lqd/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lqd/f;

    return-object p0
.end method

.method public static values()[Lqd/f;
    .locals 1

    sget-object v0, Lqd/f;->$VALUES:[Lqd/f;

    invoke-virtual {v0}, [Lqd/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lqd/f;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    sget-object v0, Lqd/f;->UNRECOGNIZED:Lqd/f;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lqd/f;->value:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
