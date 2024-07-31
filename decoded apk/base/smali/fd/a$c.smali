.class public final Lfd/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfd/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field private final a:Lgd/g;

.field private final b:Landroid/os/Bundle;

.field private final c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lgd/g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfd/a$c;->a:Lgd/g;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lfd/a$c;->b:Landroid/os/Bundle;

    invoke-virtual {p1}, Lgd/g;->h()Lzb/g;

    move-result-object p1

    invoke-virtual {p1}, Lzb/g;->r()Lzb/p;

    move-result-object p1

    invoke-virtual {p1}, Lzb/p;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "apiKey"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p0, Lfd/a$c;->c:Landroid/os/Bundle;

    const-string v1, "parameters"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private l()V
    .locals 2

    iget-object v0, p0, Lfd/a$c;->b:Landroid/os/Bundle;

    const-string v1, "apiKey"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Missing API key. Set with setApiKey()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a()Lfd/a;
    .locals 2

    iget-object v0, p0, Lfd/a$c;->b:Landroid/os/Bundle;

    invoke-static {v0}, Lgd/g;->j(Landroid/os/Bundle;)V

    new-instance v0, Lfd/a;

    iget-object v1, p0, Lfd/a$c;->b:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Lfd/a;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public b(I)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/android/gms/tasks/Task<",
            "Lfd/d;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lfd/a$c;->l()V

    iget-object v0, p0, Lfd/a$c;->b:Landroid/os/Bundle;

    const-string v1, "suffix"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object p1, p0, Lfd/a$c;->a:Lgd/g;

    iget-object v0, p0, Lfd/a$c;->b:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Lgd/g;->g(Landroid/os/Bundle;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public c(Lfd/a$b;)Lfd/a$c;
    .locals 1

    iget-object v0, p0, Lfd/a$c;->c:Landroid/os/Bundle;

    iget-object p1, p1, Lfd/a$b;->a:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lfd/a$c;
    .locals 3

    const-string v0, "(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lfd/a$c;->b:Landroid/os/Bundle;

    const-string v1, "https://"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "domain"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lfd/a$c;->b:Landroid/os/Bundle;

    const-string v1, "domainUriPrefix"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public e(Lfd/a$d;)Lfd/a$c;
    .locals 1

    iget-object v0, p0, Lfd/a$c;->c:Landroid/os/Bundle;

    iget-object p1, p1, Lfd/a$d;->a:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public f(Lfd/a$e;)Lfd/a$c;
    .locals 1

    iget-object v0, p0, Lfd/a$c;->c:Landroid/os/Bundle;

    iget-object p1, p1, Lfd/a$e;->a:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public g(Lfd/a$f;)Lfd/a$c;
    .locals 1

    iget-object v0, p0, Lfd/a$c;->c:Landroid/os/Bundle;

    iget-object p1, p1, Lfd/a$f;->a:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public h(Landroid/net/Uri;)Lfd/a$c;
    .locals 2

    iget-object v0, p0, Lfd/a$c;->c:Landroid/os/Bundle;

    const-string v1, "link"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object p0
.end method

.method public i(Landroid/net/Uri;)Lfd/a$c;
    .locals 2

    iget-object v0, p0, Lfd/a$c;->b:Landroid/os/Bundle;

    const-string v1, "dynamicLink"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-object p0
.end method

.method public j(Lfd/a$g;)Lfd/a$c;
    .locals 1

    iget-object v0, p0, Lfd/a$c;->c:Landroid/os/Bundle;

    iget-object p1, p1, Lfd/a$g;->a:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public k(Lfd/a$h;)Lfd/a$c;
    .locals 1

    iget-object v0, p0, Lfd/a$c;->c:Landroid/os/Bundle;

    iget-object p1, p1, Lfd/a$h;->a:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    return-object p0
.end method
