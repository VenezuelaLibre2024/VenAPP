.class public final Lqd/d0;
.super Lcom/google/protobuf/x;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqd/d0$a;,
        Lqd/d0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/x<",
        "Lqd/d0;",
        "Lqd/d0$a;",
        ">;",
        "Lcom/google/protobuf/s0;"
    }
.end annotation


# static fields
.field public static final BANNER_FIELD_NUMBER:I = 0x1

.field public static final CARD_FIELD_NUMBER:I = 0x4

.field private static final DEFAULT_INSTANCE:Lqd/d0;

.field public static final IMAGE_ONLY_FIELD_NUMBER:I = 0x3

.field public static final MODAL_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/z0<",
            "Lqd/d0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private messageDetailsCase_:I

.field private messageDetails_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqd/d0;

    invoke-direct {v0}, Lqd/d0;-><init>()V

    sput-object v0, Lqd/d0;->DEFAULT_INSTANCE:Lqd/d0;

    const-class v1, Lqd/d0;

    invoke-static {v1, v0}, Lcom/google/protobuf/x;->W(Ljava/lang/Class;Lcom/google/protobuf/x;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/x;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lqd/d0;->messageDetailsCase_:I

    return-void
.end method

.method static synthetic Z()Lqd/d0;
    .locals 1

    sget-object v0, Lqd/d0;->DEFAULT_INSTANCE:Lqd/d0;

    return-object v0
.end method

.method public static e0()Lqd/d0;
    .locals 1

    sget-object v0, Lqd/d0;->DEFAULT_INSTANCE:Lqd/d0;

    return-object v0
.end method


# virtual methods
.method protected final E(Lcom/google/protobuf/x$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lqd/y;->a:[I

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
    sget-object p1, Lqd/d0;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lqd/d0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lqd/d0;->PARSER:Lcom/google/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/x$b;

    sget-object p3, Lqd/d0;->DEFAULT_INSTANCE:Lqd/d0;

    invoke-direct {p1, p3}, Lcom/google/protobuf/x$b;-><init>(Lcom/google/protobuf/x;)V

    sput-object p1, Lqd/d0;->PARSER:Lcom/google/protobuf/z0;

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
    sget-object p1, Lqd/d0;->DEFAULT_INSTANCE:Lqd/d0;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "messageDetails_"

    aput-object v0, p1, p3

    const-string p3, "messageDetailsCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lqd/a0;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lqd/f0;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-class p3, Lqd/e0;

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-class p3, Lqd/c0;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000"

    sget-object p3, Lqd/d0;->DEFAULT_INSTANCE:Lqd/d0;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/x;->T(Lcom/google/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lqd/d0$a;

    invoke-direct {p1, p3}, Lqd/d0$a;-><init>(Lqd/y;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lqd/d0;

    invoke-direct {p1}, Lqd/d0;-><init>()V

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

.method public b0()Lqd/a0;
    .locals 2

    iget v0, p0, Lqd/d0;->messageDetailsCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lqd/d0;->messageDetails_:Ljava/lang/Object;

    check-cast v0, Lqd/a0;

    return-object v0

    :cond_0
    invoke-static {}, Lqd/a0;->f0()Lqd/a0;

    move-result-object v0

    return-object v0
.end method

.method public d0()Lqd/c0;
    .locals 2

    iget v0, p0, Lqd/d0;->messageDetailsCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lqd/d0;->messageDetails_:Ljava/lang/Object;

    check-cast v0, Lqd/c0;

    return-object v0

    :cond_0
    invoke-static {}, Lqd/c0;->e0()Lqd/c0;

    move-result-object v0

    return-object v0
.end method

.method public f0()Lqd/e0;
    .locals 2

    iget v0, p0, Lqd/d0;->messageDetailsCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lqd/d0;->messageDetails_:Ljava/lang/Object;

    check-cast v0, Lqd/e0;

    return-object v0

    :cond_0
    invoke-static {}, Lqd/e0;->d0()Lqd/e0;

    move-result-object v0

    return-object v0
.end method

.method public g0()Lqd/d0$b;
    .locals 1

    iget v0, p0, Lqd/d0;->messageDetailsCase_:I

    invoke-static {v0}, Lqd/d0$b;->b(I)Lqd/d0$b;

    move-result-object v0

    return-object v0
.end method

.method public h0()Lqd/f0;
    .locals 2

    iget v0, p0, Lqd/d0;->messageDetailsCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lqd/d0;->messageDetails_:Ljava/lang/Object;

    check-cast v0, Lqd/f0;

    return-object v0

    :cond_0
    invoke-static {}, Lqd/f0;->g0()Lqd/f0;

    move-result-object v0

    return-object v0
.end method
