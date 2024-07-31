.class public final Lcom/google/firebase/iid/Registrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/iid/Registrar$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static final synthetic lambda$getComponents$0$Registrar(Lpc/d;)Lcom/google/firebase/iid/FirebaseInstanceId;
    .locals 5

    new-instance v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    const-class v1, Lzb/g;

    invoke-interface {p0, v1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzb/g;

    const-class v2, Lye/i;

    invoke-interface {p0, v2}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v2

    const-class v3, Lod/j;

    invoke-interface {p0, v3}, Lpc/d;->f(Ljava/lang/Class;)Lee/b;

    move-result-object v3

    const-class v4, Lfe/f;

    invoke-interface {p0, v4}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfe/f;

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/google/firebase/iid/FirebaseInstanceId;-><init>(Lzb/g;Lee/b;Lee/b;Lfe/f;)V

    return-object v0
.end method

.method static final synthetic lambda$getComponents$1$Registrar(Lpc/d;)Lpd/a;
    .locals 2

    new-instance v0, Lcom/google/firebase/iid/Registrar$a;

    const-class v1, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-interface {p0, v1}, Lpc/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-direct {v0, p0}, Lcom/google/firebase/iid/Registrar$a;-><init>(Lcom/google/firebase/iid/FirebaseInstanceId;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lpc/c<",
            "*>;>;"
        }
    .end annotation

    const-class v0, Lcom/google/firebase/iid/FirebaseInstanceId;

    invoke-static {v0}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v1

    const-class v2, Lzb/g;

    invoke-static {v2}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v2, Lye/i;

    invoke-static {v2}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v2, Lod/j;

    invoke-static {v2}, Lpc/q;->i(Ljava/lang/Class;)Lpc/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    const-class v2, Lfe/f;

    invoke-static {v2}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v2

    invoke-virtual {v1, v2}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v1

    sget-object v2, Lcom/google/firebase/iid/o;->a:Lpc/g;

    invoke-virtual {v1, v2}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->c()Lpc/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lpc/c$b;->d()Lpc/c;

    move-result-object v1

    const-class v2, Lpd/a;

    invoke-static {v2}, Lpc/c;->c(Ljava/lang/Class;)Lpc/c$b;

    move-result-object v2

    invoke-static {v0}, Lpc/q;->j(Ljava/lang/Class;)Lpc/q;

    move-result-object v0

    invoke-virtual {v2, v0}, Lpc/c$b;->b(Lpc/q;)Lpc/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/iid/p;->a:Lpc/g;

    invoke-virtual {v0, v2}, Lpc/c$b;->f(Lpc/g;)Lpc/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lpc/c$b;->d()Lpc/c;

    move-result-object v0

    const-string v2, "fire-iid"

    const-string v3, "21.1.0"

    invoke-static {v2, v3}, Lye/h;->b(Ljava/lang/String;Ljava/lang/String;)Lpc/c;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Lpc/c;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v1, 0x1

    aput-object v0, v3, v1

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
