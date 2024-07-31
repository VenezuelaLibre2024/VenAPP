.class Lwi/h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwi/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lwi/h;


# direct methods
.method constructor <init>(Lwi/h;)V
    .locals 0

    iput-object p1, p0, Lwi/h$a;->a:Lwi/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lvi/g1;)V
    .locals 4

    const-string v0, "OkHttpClientStream$Sink.cancel"

    invoke-static {v0}, Lcj/c;->f(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lwi/h$a;->a:Lwi/h;

    invoke-static {v0}, Lwi/h;->H(Lwi/h;)Lwi/h$b;

    move-result-object v0

    invoke-static {v0}, Lwi/h$b;->W(Lwi/h$b;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lwi/h$a;->a:Lwi/h;

    invoke-static {v1}, Lwi/h;->H(Lwi/h;)Lwi/h$b;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, p1, v2, v3}, Lwi/h$b;->Z(Lwi/h$b;Lvi/g1;ZLvi/w0;)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string p1, "OkHttpClientStream$Sink.cancel"

    invoke-static {p1}, Lcj/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    const-string v0, "OkHttpClientStream$Sink.cancel"

    invoke-static {v0}, Lcj/c;->h(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Lio/grpc/internal/o2;ZZI)V
    .locals 2

    const-string v0, "OkHttpClientStream$Sink.writeFrame"

    invoke-static {v0}, Lcj/c;->f(Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-static {}, Lwi/h;->I()Ldm/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast p1, Lwi/o;

    invoke-virtual {p1}, Lwi/o;->c()Ldm/b;

    move-result-object p1

    invoke-virtual {p1}, Ldm/b;->size()J

    move-result-wide v0

    long-to-int v0, v0

    if-lez v0, :cond_1

    iget-object v1, p0, Lwi/h$a;->a:Lwi/h;

    invoke-static {v1, v0}, Lwi/h;->J(Lwi/h;I)V

    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lwi/h$a;->a:Lwi/h;

    invoke-static {v0}, Lwi/h;->H(Lwi/h;)Lwi/h$b;

    move-result-object v0

    invoke-static {v0}, Lwi/h$b;->W(Lwi/h$b;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lwi/h$a;->a:Lwi/h;

    invoke-static {v1}, Lwi/h;->H(Lwi/h;)Lwi/h$b;

    move-result-object v1

    invoke-static {v1, p1, p2, p3}, Lwi/h$b;->Y(Lwi/h$b;Ldm/b;ZZ)V

    iget-object p1, p0, Lwi/h$a;->a:Lwi/h;

    invoke-static {p1}, Lwi/h;->K(Lwi/h;)Lio/grpc/internal/n2;

    move-result-object p1

    invoke-virtual {p1, p4}, Lio/grpc/internal/n2;->e(I)V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string p1, "OkHttpClientStream$Sink.writeFrame"

    invoke-static {p1}, Lcj/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    const-string p2, "OkHttpClientStream$Sink.writeFrame"

    invoke-static {p2}, Lcj/c;->h(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lvi/w0;[B)V
    .locals 3

    const-string v0, "OkHttpClientStream$Sink.writeHeaders"

    invoke-static {v0}, Lcj/c;->f(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwi/h$a;->a:Lwi/h;

    invoke-static {v1}, Lwi/h;->A(Lwi/h;)Lvi/x0;

    move-result-object v1

    invoke-virtual {v1}, Lvi/x0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz p2, :cond_0

    iget-object v1, p0, Lwi/h$a;->a:Lwi/h;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lwi/h;->D(Lwi/h;Z)Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lfb/a;->b()Lfb/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lfb/a;->f([B)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    :try_start_0
    iget-object p2, p0, Lwi/h$a;->a:Lwi/h;

    invoke-static {p2}, Lwi/h;->H(Lwi/h;)Lwi/h$b;

    move-result-object p2

    invoke-static {p2}, Lwi/h$b;->W(Lwi/h$b;)Ljava/lang/Object;

    move-result-object p2

    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lwi/h$a;->a:Lwi/h;

    invoke-static {v1}, Lwi/h;->H(Lwi/h;)Lwi/h$b;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lwi/h$b;->X(Lwi/h$b;Lvi/w0;Ljava/lang/String;)V

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string p1, "OkHttpClientStream$Sink.writeHeaders"

    invoke-static {p1}, Lcj/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    const-string p2, "OkHttpClientStream$Sink.writeHeaders"

    invoke-static {p2}, Lcj/c;->h(Ljava/lang/String;)V

    throw p1
.end method
