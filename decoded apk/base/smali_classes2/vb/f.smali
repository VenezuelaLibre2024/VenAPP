.class public final Lvb/f;
.super Lcom/google/crypto/tink/shaded/protobuf/y;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/s0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvb/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/y<",
        "Lvb/f;",
        "Lvb/f$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/s0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lvb/f;

.field public static final KEY_VALUE_FIELD_NUMBER:I = 0x3

.field public static final PARAMS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/z0<",
            "Lvb/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

.field private params_:Lvb/h;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvb/f;

    invoke-direct {v0}, Lvb/f;-><init>()V

    sput-object v0, Lvb/f;->DEFAULT_INSTANCE:Lvb/f;

    const-class v1, Lvb/f;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->S(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/y;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/h;->b:Lcom/google/crypto/tink/shaded/protobuf/h;

    iput-object v0, p0, Lvb/f;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method static synthetic V()Lvb/f;
    .locals 1

    sget-object v0, Lvb/f;->DEFAULT_INSTANCE:Lvb/f;

    return-object v0
.end method

.method static synthetic W(Lvb/f;I)V
    .locals 0

    invoke-direct {p0, p1}, Lvb/f;->h0(I)V

    return-void
.end method

.method static synthetic X(Lvb/f;Lvb/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lvb/f;->g0(Lvb/h;)V

    return-void
.end method

.method static synthetic Y(Lvb/f;Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lvb/f;->f0(Lcom/google/crypto/tink/shaded/protobuf/h;)V

    return-void
.end method

.method public static Z()Lvb/f;
    .locals 1

    sget-object v0, Lvb/f;->DEFAULT_INSTANCE:Lvb/f;

    return-object v0
.end method

.method public static d0()Lvb/f$b;
    .locals 1

    sget-object v0, Lvb/f;->DEFAULT_INSTANCE:Lvb/f;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/y;->u()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    check-cast v0, Lvb/f$b;

    return-object v0
.end method

.method public static e0(Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lvb/f;
    .locals 1

    sget-object v0, Lvb/f;->DEFAULT_INSTANCE:Lvb/f;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->M(Lcom/google/crypto/tink/shaded/protobuf/y;Lcom/google/crypto/tink/shaded/protobuf/h;Lcom/google/crypto/tink/shaded/protobuf/p;)Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object p0

    check-cast p0, Lvb/f;

    return-object p0
.end method

.method private f0(Lcom/google/crypto/tink/shaded/protobuf/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvb/f;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-void
.end method

.method private g0(Lvb/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lvb/f;->params_:Lvb/h;

    return-void
.end method

.method private h0(I)V
    .locals 0

    iput p1, p0, Lvb/f;->version_:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lcom/google/crypto/tink/shaded/protobuf/r0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->U()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public a0()Lcom/google/crypto/tink/shaded/protobuf/h;
    .locals 1

    iget-object v0, p0, Lvb/f;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/h;

    return-object v0
.end method

.method public b0()Lvb/h;
    .locals 1

    iget-object v0, p0, Lvb/f;->params_:Lvb/h;

    if-nez v0, :cond_0

    invoke-static {}, Lvb/h;->X()Lvb/h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public c0()I
    .locals 1

    iget v0, p0, Lvb/f;->version_:I

    return v0
.end method

.method public bridge synthetic d()Lcom/google/crypto/tink/shaded/protobuf/r0$a;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->J()Lcom/google/crypto/tink/shaded/protobuf/y$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic e()Lcom/google/crypto/tink/shaded/protobuf/r0;
    .locals 1

    invoke-super {p0}, Lcom/google/crypto/tink/shaded/protobuf/y;->A()Lcom/google/crypto/tink/shaded/protobuf/y;

    move-result-object v0

    return-object v0
.end method

.method protected final x(Lcom/google/crypto/tink/shaded/protobuf/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lvb/f$a;->a:[I

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
    sget-object p1, Lvb/f;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0;

    if-nez p1, :cond_1

    const-class p2, Lvb/f;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lvb/f;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/y$b;

    sget-object p3, Lvb/f;->DEFAULT_INSTANCE:Lvb/f;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/y$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/y;)V

    sput-object p1, Lvb/f;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/z0;

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
    sget-object p1, Lvb/f;->DEFAULT_INSTANCE:Lvb/f;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "version_"

    aput-object v0, p1, p3

    const-string p3, "params_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "keyValue_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"

    sget-object p3, Lvb/f;->DEFAULT_INSTANCE:Lvb/f;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/y;->K(Lcom/google/crypto/tink/shaded/protobuf/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lvb/f$b;

    invoke-direct {p1, p3}, Lvb/f$b;-><init>(Lvb/f$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lvb/f;

    invoke-direct {p1}, Lvb/f;-><init>()V

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
