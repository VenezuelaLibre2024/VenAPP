.class public Lde/c$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lde/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field a:Lde/n;

.field b:Lde/n;

.field c:Lde/g;

.field d:Lde/a;

.field e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lde/e;Ljava/util/Map;)Lde/c;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/e;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lde/c;"
        }
    .end annotation

    iget-object v0, p0, Lde/c$b;->a:Lde/n;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lde/c$b;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lde/c;

    iget-object v3, p0, Lde/c$b;->a:Lde/n;

    iget-object v4, p0, Lde/c$b;->b:Lde/n;

    iget-object v5, p0, Lde/c$b;->c:Lde/g;

    iget-object v6, p0, Lde/c$b;->d:Lde/a;

    iget-object v7, p0, Lde/c$b;->e:Ljava/lang/String;

    const/4 v9, 0x0

    move-object v1, v0

    move-object v2, p1

    move-object v8, p2

    invoke-direct/range {v1 .. v9}, Lde/c;-><init>(Lde/e;Lde/n;Lde/n;Lde/g;Lde/a;Ljava/lang/String;Ljava/util/Map;Lde/c$a;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Banner model must have a background color"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Banner model must have a title"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Lde/a;)Lde/c$b;
    .locals 0

    iput-object p1, p0, Lde/c$b;->d:Lde/a;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lde/c$b;
    .locals 0

    iput-object p1, p0, Lde/c$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public d(Lde/n;)Lde/c$b;
    .locals 0

    iput-object p1, p0, Lde/c$b;->b:Lde/n;

    return-object p0
.end method

.method public e(Lde/g;)Lde/c$b;
    .locals 0

    iput-object p1, p0, Lde/c$b;->c:Lde/g;

    return-object p0
.end method

.method public f(Lde/n;)Lde/c$b;
    .locals 0

    iput-object p1, p0, Lde/c$b;->a:Lde/n;

    return-object p0
.end method
