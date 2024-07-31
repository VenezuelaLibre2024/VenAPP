.class public final enum Lxe/l;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/z$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/l$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxe/l;",
        ">;",
        "Lcom/google/protobuf/z$c;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lxe/l;

.field public static final enum GAUGES_AND_SYSTEM_EVENTS:Lxe/l;

.field public static final GAUGES_AND_SYSTEM_EVENTS_VALUE:I = 0x1

.field public static final enum SESSION_VERBOSITY_NONE:Lxe/l;

.field public static final SESSION_VERBOSITY_NONE_VALUE:I

.field private static final internalValueMap:Lcom/google/protobuf/z$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$d<",
            "Lxe/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lxe/l;

    const-string v1, "SESSION_VERBOSITY_NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lxe/l;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lxe/l;->SESSION_VERBOSITY_NONE:Lxe/l;

    new-instance v1, Lxe/l;

    const-string v3, "GAUGES_AND_SYSTEM_EVENTS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lxe/l;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lxe/l;->GAUGES_AND_SYSTEM_EVENTS:Lxe/l;

    const/4 v3, 0x2

    new-array v3, v3, [Lxe/l;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lxe/l;->$VALUES:[Lxe/l;

    new-instance v0, Lxe/l$a;

    invoke-direct {v0}, Lxe/l$a;-><init>()V

    sput-object v0, Lxe/l;->internalValueMap:Lcom/google/protobuf/z$d;

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

    iput p3, p0, Lxe/l;->value:I

    return-void
.end method

.method public static b(I)Lxe/l;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lxe/l;->GAUGES_AND_SYSTEM_EVENTS:Lxe/l;

    return-object p0

    :cond_1
    sget-object p0, Lxe/l;->SESSION_VERBOSITY_NONE:Lxe/l;

    return-object p0
.end method

.method public static h()Lcom/google/protobuf/z$e;
    .locals 1

    sget-object v0, Lxe/l$b;->a:Lcom/google/protobuf/z$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxe/l;
    .locals 1

    const-class v0, Lxe/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxe/l;

    return-object p0
.end method

.method public static values()[Lxe/l;
    .locals 1

    sget-object v0, Lxe/l;->$VALUES:[Lxe/l;

    invoke-virtual {v0}, [Lxe/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxe/l;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lxe/l;->value:I

    return v0
.end method
