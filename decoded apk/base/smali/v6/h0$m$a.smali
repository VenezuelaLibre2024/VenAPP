.class Lv6/h0$m$a;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv6/h0$m;-><init>(Lv6/h0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv6/h0;

.field final synthetic b:Lv6/h0$m;


# direct methods
.method constructor <init>(Lv6/h0$m;Lv6/h0;)V
    .locals 0

    iput-object p1, p0, Lv6/h0$m$a;->b:Lv6/h0$m;

    iput-object p2, p0, Lv6/h0$m$a;->a:Lv6/h0;

    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    iget-object p2, p0, Lv6/h0$m$a;->b:Lv6/h0$m;

    iget-object p2, p2, Lv6/h0$m;->c:Lv6/h0;

    invoke-static {p2}, Lv6/h0;->C(Lv6/h0;)Landroid/media/AudioTrack;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lv6/h0$m$a;->b:Lv6/h0$m;

    iget-object p1, p1, Lv6/h0$m;->c:Lv6/h0;

    invoke-static {p1}, Lv6/h0;->D(Lv6/h0;)Lv6/v$c;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv6/h0$m$a;->b:Lv6/h0$m;

    iget-object p1, p1, Lv6/h0$m;->c:Lv6/h0;

    invoke-static {p1}, Lv6/h0;->x(Lv6/h0;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv6/h0$m$a;->b:Lv6/h0$m;

    iget-object p1, p1, Lv6/h0$m;->c:Lv6/h0;

    invoke-static {p1}, Lv6/h0;->D(Lv6/h0;)Lv6/v$c;

    move-result-object p1

    invoke-interface {p1}, Lv6/v$c;->f()V

    :cond_1
    return-void
.end method

.method public onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    iget-object v0, p0, Lv6/h0$m$a;->b:Lv6/h0$m;

    iget-object v0, v0, Lv6/h0$m;->c:Lv6/h0;

    invoke-static {v0}, Lv6/h0;->C(Lv6/h0;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lv6/h0$m$a;->b:Lv6/h0$m;

    iget-object p1, p1, Lv6/h0$m;->c:Lv6/h0;

    invoke-static {p1}, Lv6/h0;->D(Lv6/h0;)Lv6/v$c;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv6/h0$m$a;->b:Lv6/h0$m;

    iget-object p1, p1, Lv6/h0$m;->c:Lv6/h0;

    invoke-static {p1}, Lv6/h0;->x(Lv6/h0;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lv6/h0$m$a;->b:Lv6/h0$m;

    iget-object p1, p1, Lv6/h0$m;->c:Lv6/h0;

    invoke-static {p1}, Lv6/h0;->D(Lv6/h0;)Lv6/v$c;

    move-result-object p1

    invoke-interface {p1}, Lv6/v$c;->f()V

    :cond_1
    return-void
.end method
