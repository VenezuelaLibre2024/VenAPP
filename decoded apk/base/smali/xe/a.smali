.class public final Lxe/a;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lxe/a;",
        "Lxe/a$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lxe/a;

.field public static final PACKAGE_NAME_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lxe/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final SDK_VERSION_FIELD_NUMBER:I = 0x2

.field public static final VERSION_NAME_FIELD_NUMBER:I = 0x3


# instance fields
.field private bitField0_:I

.field private packageName_:Ljava/lang/String;

.field private sdkVersion_:Ljava/lang/String;

.field private versionName_:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxe/a;

    invoke-direct {v0}, Lxe/a;-><init>()V

    sput-object v0, Lxe/a;->DEFAULT_INSTANCE:Lxe/a;

    const-class v1, Lxe/a;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lxe/a;->packageName_:Ljava/lang/String;

    iput-object v0, p0, Lxe/a;->sdkVersion_:Ljava/lang/String;

    iput-object v0, p0, Lxe/a;->versionName_:Ljava/lang/String;

    return-void
.end method

.method static synthetic Z()Lxe/a;
    .locals 1

    sget-object v0, Lxe/a;->DEFAULT_INSTANCE:Lxe/a;

    return-object v0
.end method

.method static synthetic b0(Lxe/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/a;->j0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic d0(Lxe/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/a;->k0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic e0(Lxe/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/a;->l0(Ljava/lang/String;)V

    return-void
.end method

.method public static f0()Lxe/a;
    .locals 1

    sget-object v0, Lxe/a;->DEFAULT_INSTANCE:Lxe/a;

    return-object v0
.end method

.method public static i0()Lxe/a$b;
    .locals 1

    sget-object v0, Lxe/a;->DEFAULT_INSTANCE:Lxe/a;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lxe/a$b;

    return-object v0
.end method

.method private j0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lxe/a;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lxe/a;->bitField0_:I

    iput-object p1, p0, Lxe/a;->packageName_:Ljava/lang/String;

    return-void
.end method

.method private k0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lxe/a;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lxe/a;->bitField0_:I

    iput-object p1, p0, Lxe/a;->sdkVersion_:Ljava/lang/String;

    return-void
.end method

.method private l0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lxe/a;->bitField0_:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lxe/a;->bitField0_:I

    iput-object p1, p0, Lxe/a;->versionName_:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lxe/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lxe/a;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lxe/a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lxe/a;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lxe/a;->DEFAULT_INSTANCE:Lxe/a;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lxe/a;->PARSER:Lcom/google/protobuf/z0;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lxe/a;->DEFAULT_INSTANCE:Lxe/a;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "packageName_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "sdkVersion_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "versionName_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002"

    sget-object p3, Lxe/a;->DEFAULT_INSTANCE:Lxe/a;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lxe/a$b;

    invoke-direct {p1, p3}, Lxe/a$b;-><init>(Lxe/a$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lxe/a;

    invoke-direct {p1}, Lxe/a;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g0()Z
    .locals 2

    iget v0, p0, Lxe/a;->bitField0_:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public h0()Z
    .locals 1

    iget v0, p0, Lxe/a;->bitField0_:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
