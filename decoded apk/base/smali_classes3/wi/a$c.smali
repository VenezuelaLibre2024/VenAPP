.class Lwi/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwi/a;->close()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lwi/a;


# direct methods
.method constructor <init>(Lwi/a;)V
    .locals 0

    iput-object p1, p0, Lwi/a$c;->a:Lwi/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v0}, Lwi/a;->i(Lwi/a;)Ldm/v;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v0}, Lwi/a;->b(Lwi/a;)Ldm/b;

    move-result-object v0

    invoke-virtual {v0}, Ldm/b;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-object v0, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v0}, Lwi/a;->i(Lwi/a;)Ldm/v;

    move-result-object v0

    iget-object v1, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v1}, Lwi/a;->b(Lwi/a;)Ldm/b;

    move-result-object v1

    iget-object v2, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v2}, Lwi/a;->b(Lwi/a;)Ldm/b;

    move-result-object v2

    invoke-virtual {v2}, Ldm/b;->size()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Ldm/v;->K0(Ldm/b;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v1}, Lwi/a;->l(Lwi/a;)Lwi/b$a;

    move-result-object v1

    invoke-interface {v1, v0}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v0}, Lwi/a;->b(Lwi/a;)Ldm/b;

    move-result-object v0

    invoke-virtual {v0}, Ldm/b;->close()V

    :try_start_1
    iget-object v0, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v0}, Lwi/a;->i(Lwi/a;)Ldm/v;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v0}, Lwi/a;->i(Lwi/a;)Ldm/v;

    move-result-object v0

    invoke-interface {v0}, Ldm/v;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    iget-object v1, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v1}, Lwi/a;->l(Lwi/a;)Lwi/b$a;

    move-result-object v1

    invoke-interface {v1, v0}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    :try_start_2
    iget-object v0, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v0}, Lwi/a;->n(Lwi/a;)Ljava/net/Socket;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v0}, Lwi/a;->n(Lwi/a;)Ljava/net/Socket;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    iget-object v1, p0, Lwi/a$c;->a:Lwi/a;

    invoke-static {v1}, Lwi/a;->l(Lwi/a;)Lwi/b$a;

    move-result-object v1

    invoke-interface {v1, v0}, Lwi/b$a;->h(Ljava/lang/Throwable;)V

    :cond_2
    :goto_2
    return-void
.end method
