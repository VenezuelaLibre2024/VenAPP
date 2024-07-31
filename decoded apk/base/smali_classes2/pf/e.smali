.class public final Lpf/e;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpf/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lpf/e;",
        "Lpf/e$b;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lpf/e;

.field public static final EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER:I = 0x2

.field public static final MESSAGES_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lpf/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private expirationEpochTimestampMillis_:J

.field private messages_:Lcom/google/protobuf/z$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z$i<",
            "Lof/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpf/e;

    invoke-direct {v0}, Lpf/e;-><init>()V

    sput-object v0, Lpf/e;->DEFAULT_INSTANCE:Lpf/e;

    const-class v1, Lpf/e;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    invoke-static {}, Lcom/google/protobuf/x;->G()Lcom/google/protobuf/z$i;

    move-result-object v0

    iput-object v0, p0, Lpf/e;->messages_:Lcom/google/protobuf/z$i;

    return-void
.end method

.method static synthetic Z()Lpf/e;
    .locals 1

    sget-object v0, Lpf/e;->DEFAULT_INSTANCE:Lpf/e;

    return-object v0
.end method

.method static synthetic b0(Lpf/e;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpf/e;->i0(J)V

    return-void
.end method

.method public static d0()Lpf/e;
    .locals 1

    sget-object v0, Lpf/e;->DEFAULT_INSTANCE:Lpf/e;

    return-object v0
.end method

.method public static g0()Lpf/e$b;
    .locals 1

    sget-object v0, Lpf/e;->DEFAULT_INSTANCE:Lpf/e;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->A()Lcom/google/protobuf/x$a;

    move-result-object v0

    check-cast v0, Lpf/e$b;

    return-object v0
.end method

.method public static h0()Lcom/google/protobuf/z0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/z0<",
            "Lpf/e;",
            ">;"
        }
    .end annotation

    sget-object v0, Lpf/e;->DEFAULT_INSTANCE:Lpf/e;

    invoke-virtual {v0}, Lcom/google/protobuf/x;->g()Lcom/google/protobuf/z0;

    move-result-object v0

    return-object v0
.end method

.method private i0(J)V
    .locals 0

    iput-wide p1, p0, Lpf/e;->expirationEpochTimestampMillis_:J

    return-void
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lpf/e$a;->a:[I

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
    sget-object p1, Lpf/e;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lpf/e;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lpf/e;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lpf/e;->DEFAULT_INSTANCE:Lpf/e;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lpf/e;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lpf/e;->DEFAULT_INSTANCE:Lpf/e;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "messages_"

    aput-object v0, p1, p3

    const-class p3, Lof/c;

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "expirationEpochTimestampMillis_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002"

    sget-object p3, Lpf/e;->DEFAULT_INSTANCE:Lpf/e;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lpf/e$b;

    invoke-direct {p1, p3}, Lpf/e$b;-><init>(Lpf/e$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lpf/e;

    invoke-direct {p1}, Lpf/e;-><init>()V

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

.method public e0()J
    .locals 2

    iget-wide v0, p0, Lpf/e;->expirationEpochTimestampMillis_:J

    return-wide v0
.end method

.method public f0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lof/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lpf/e;->messages_:Lcom/google/protobuf/z$i;

    return-object v0
.end method
