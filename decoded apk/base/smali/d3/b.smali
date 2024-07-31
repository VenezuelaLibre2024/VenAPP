.class public Ld3/b;
.super Lql/b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/b$a;
    }
.end annotation


# instance fields
.field protected final b:Lql/b0;

.field protected final c:Ld3/a;

.field protected final d:Ljava/lang/String;

.field protected e:Ld3/b$a;


# direct methods
.method public constructor <init>(Lql/b0;Ljava/lang/String;Ld3/a;)V
    .locals 0

    invoke-direct {p0}, Lql/b0;-><init>()V

    iput-object p1, p0, Ld3/b;->b:Lql/b0;

    iput-object p2, p0, Ld3/b;->d:Ljava/lang/String;

    iput-object p3, p0, Ld3/b;->c:Ld3/a;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-object v0, p0, Ld3/b;->b:Lql/b0;

    invoke-virtual {v0}, Lql/b0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lql/w;
    .locals 1

    iget-object v0, p0, Ld3/b;->b:Lql/b0;

    invoke-virtual {v0}, Lql/b0;->b()Lql/w;

    move-result-object v0

    return-object v0
.end method

.method public f(Ldm/c;)V
    .locals 1

    :try_start_0
    new-instance v0, Ld3/b$a;

    invoke-direct {v0, p0, p1}, Ld3/b$a;-><init>(Ld3/b;Ldm/v;)V

    iput-object v0, p0, Ld3/b;->e:Ld3/b$a;

    invoke-static {v0}, Ldm/l;->a(Ldm/v;)Ldm/c;

    move-result-object p1

    iget-object v0, p0, Ld3/b;->b:Lql/b0;

    invoke-virtual {v0, p1}, Lql/b0;->f(Ldm/c;)V

    invoke-interface {p1}, Ldm/c;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Ld3/b;->g(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public g(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Ld3/b;->c:Ld3/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ld3/b;->d:Ljava/lang/String;

    const-string v2, "upload_task_error"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, v2, p1}, Ld3/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public h(JJ)V
    .locals 6

    iget-object v0, p0, Ld3/b;->c:Ld3/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ld3/b;->d:Ljava/lang/String;

    move-wide v2, p1

    move-wide v4, p3

    invoke-interface/range {v0 .. v5}, Ld3/a;->c(Ljava/lang/String;JJ)V

    :cond_0
    return-void
.end method
