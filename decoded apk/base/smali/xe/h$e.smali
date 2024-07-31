.class public final enum Lxe/h$e;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/z$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/h$e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxe/h$e;",
        ">;",
        "Lcom/google/protobuf/z$c;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lxe/h$e;

.field public static final enum GENERIC_CLIENT_ERROR:Lxe/h$e;

.field public static final GENERIC_CLIENT_ERROR_VALUE:I = 0x1

.field public static final enum NETWORK_CLIENT_ERROR_REASON_UNKNOWN:Lxe/h$e;

.field public static final NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE:I

.field private static final internalValueMap:Lcom/google/protobuf/z$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$d<",
            "Lxe/h$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lxe/h$e;

    const-string v1, "NETWORK_CLIENT_ERROR_REASON_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lxe/h$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lxe/h$e;->NETWORK_CLIENT_ERROR_REASON_UNKNOWN:Lxe/h$e;

    new-instance v1, Lxe/h$e;

    const-string v3, "GENERIC_CLIENT_ERROR"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lxe/h$e;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lxe/h$e;->GENERIC_CLIENT_ERROR:Lxe/h$e;

    const/4 v3, 0x2

    new-array v3, v3, [Lxe/h$e;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lxe/h$e;->$VALUES:[Lxe/h$e;

    new-instance v0, Lxe/h$e$a;

    invoke-direct {v0}, Lxe/h$e$a;-><init>()V

    sput-object v0, Lxe/h$e;->internalValueMap:Lcom/google/protobuf/z$d;

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

    iput p3, p0, Lxe/h$e;->value:I

    return-void
.end method

.method public static b(I)Lxe/h$e;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lxe/h$e;->GENERIC_CLIENT_ERROR:Lxe/h$e;

    return-object p0

    :cond_1
    sget-object p0, Lxe/h$e;->NETWORK_CLIENT_ERROR_REASON_UNKNOWN:Lxe/h$e;

    return-object p0
.end method

.method public static h()Lcom/google/protobuf/z$e;
    .locals 1

    sget-object v0, Lxe/h$e$b;->a:Lcom/google/protobuf/z$e;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxe/h$e;
    .locals 1

    const-class v0, Lxe/h$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxe/h$e;

    return-object p0
.end method

.method public static values()[Lxe/h$e;
    .locals 1

    sget-object v0, Lxe/h$e;->$VALUES:[Lxe/h$e;

    invoke-virtual {v0}, [Lxe/h$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxe/h$e;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lxe/h$e;->value:I

    return v0
.end method
