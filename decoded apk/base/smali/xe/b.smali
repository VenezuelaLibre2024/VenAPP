.class public final Lxe/b;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lxe/b;",
        "Lxe/b$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final CLIENT_TIME_US_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lxe/b;

.field private static volatile PARSER:Lcom/google/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lxe/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER:I = 0x2


# instance fields
.field private bitField0_:I

.field private clientTimeUs_:J

.field private usedAppJavaHeapMemoryKb_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxe/b;

    invoke-direct {v0}, Lxe/b;-><init>()V

    sput-object v0, Lxe/b;->DEFAULT_INSTANCE:Lxe/b;

    const-class v1, Lxe/b;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    return-void
.end method

.method static synthetic Z()Lxe/b;
    .locals 1

    sget-object v0, Lxe/b;->DEFAULT_INSTANCE:Lxe/b;

    return-object v0
.end method

.method static synthetic b0(Lxe/b;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lxe/b;->f0(J)V

    return-void
.end method

.method static synthetic d0(Lxe/b;I)V
    .locals 0

    invoke-direct {p0, p1}, Lxe/b;->g0(I)V

    return-void
.end method

.method public static e0()Lxe/b$b;
    .locals 1

    sget-object v0, Lxe/b;->DEFAULT_INSTANCE:Lxe/b;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lxe/b$b;

    return-object v0
.end method

.method private f0(J)V
    .locals 1

    iget v0, p0, Lxe/b;->bitField0_:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lxe/b;->bitField0_:I

    iput-wide p1, p0, Lxe/b;->clientTimeUs_:J

    return-void
.end method

.method private g0(I)V
    .locals 1

    iget v0, p0, Lxe/b;->bitField0_:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lxe/b;->bitField0_:I

    iput p1, p0, Lxe/b;->usedAppJavaHeapMemoryKb_:I

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lxe/b$a;->a:[I

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
    sget-object p1, Lxe/b;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lxe/b;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lxe/b;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lxe/b;->DEFAULT_INSTANCE:Lxe/b;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lxe/b;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lxe/b;->DEFAULT_INSTANCE:Lxe/b;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "bitField0_"

    aput-object v0, p1, p3

    const-string p3, "clientTimeUs_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "usedAppJavaHeapMemoryKb_"

    aput-object p3, p1, p2

    const-string p2, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001"

    sget-object p3, Lxe/b;->DEFAULT_INSTANCE:Lxe/b;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lxe/b$b;

    invoke-direct {p1, p3}, Lxe/b$b;-><init>(Lxe/b$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lxe/b;

    invoke-direct {p1}, Lxe/b;-><init>()V

    return-object p1

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
