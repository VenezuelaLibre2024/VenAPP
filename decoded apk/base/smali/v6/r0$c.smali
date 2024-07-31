.class final Lv6/r0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv6/v$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv6/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lv6/r0;


# direct methods
.method private constructor <init>(Lv6/r0;)V
    .locals 0

    iput-object p1, p0, Lv6/r0$c;->a:Lv6/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lv6/r0;Lv6/r0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lv6/r0$c;-><init>(Lv6/r0;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio sink error"

    invoke-static {v0, v1, p1}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lv6/r0$c;->a:Lv6/r0;

    invoke-static {v0}, Lv6/r0;->y1(Lv6/r0;)Lv6/u$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lv6/u$a;->l(Ljava/lang/Exception;)V

    return-void
.end method

.method public b(J)V
    .locals 1

    iget-object v0, p0, Lv6/r0$c;->a:Lv6/r0;

    invoke-static {v0}, Lv6/r0;->y1(Lv6/r0;)Lv6/u$a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lv6/u$a;->B(J)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lv6/r0$c;->a:Lv6/r0;

    invoke-static {v0}, Lv6/r0;->z1(Lv6/r0;)Lt6/q3$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv6/r0$c;->a:Lv6/r0;

    invoke-static {v0}, Lv6/r0;->z1(Lv6/r0;)Lt6/q3$a;

    move-result-object v0

    invoke-interface {v0}, Lt6/q3$a;->a()V

    :cond_0
    return-void
.end method

.method public d(IJJ)V
    .locals 7

    iget-object v0, p0, Lv6/r0$c;->a:Lv6/r0;

    invoke-static {v0}, Lv6/r0;->y1(Lv6/r0;)Lv6/u$a;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lv6/u$a;->D(IJJ)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lv6/r0$c;->a:Lv6/r0;

    invoke-virtual {v0}, Lv6/r0;->G1()V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lv6/r0$c;->a:Lv6/r0;

    invoke-static {v0}, Lv6/r0;->z1(Lv6/r0;)Lt6/q3$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv6/r0$c;->a:Lv6/r0;

    invoke-static {v0}, Lv6/r0;->z1(Lv6/r0;)Lt6/q3$a;

    move-result-object v0

    invoke-interface {v0}, Lt6/q3$a;->b()V

    :cond_0
    return-void
.end method

.method public onSkipSilenceEnabledChanged(Z)V
    .locals 1

    iget-object v0, p0, Lv6/r0$c;->a:Lv6/r0;

    invoke-static {v0}, Lv6/r0;->y1(Lv6/r0;)Lv6/u$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lv6/u$a;->C(Z)V

    return-void
.end method
