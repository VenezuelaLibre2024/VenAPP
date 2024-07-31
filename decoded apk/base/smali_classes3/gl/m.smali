.class final Lgl/m;
.super Lzk/h0;
.source "SourceFile"


# static fields
.field public static final c:Lgl/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgl/m;

    invoke-direct {v0}, Lgl/m;-><init>()V

    sput-object v0, Lgl/m;->c:Lgl/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lzk/h0;-><init>()V

    return-void
.end method


# virtual methods
.method public D0(Lgk/f;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Lgl/c;->t:Lgl/c;

    sget-object v0, Lgl/l;->h:Lgl/i;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lgl/f;->J0(Ljava/lang/Runnable;Lgl/i;Z)V

    return-void
.end method

.method public H0(I)Lzk/h0;
    .locals 1

    invoke-static {p1}, Lel/p;->a(I)V

    sget v0, Lgl/l;->d:I

    if-lt p1, v0, :cond_0

    return-object p0

    :cond_0
    invoke-super {p0, p1}, Lzk/h0;->H0(I)Lzk/h0;

    move-result-object p1

    return-object p1
.end method
