.class public final Li2/e;
.super Li2/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li2/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/c<",
        "Lh2/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final f:Li2/e$a;

.field private static final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li2/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li2/e$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Li2/e;->f:Li2/e$a;

    const-string v0, "NetworkMeteredCtrlr"

    invoke-static {v0}, Lf2/j;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(\"NetworkMeteredCtrlr\")"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Li2/e;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lj2/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj2/h<",
            "Lh2/b;",
            ">;)V"
        }
    .end annotation

    const-string v0, "tracker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Li2/c;-><init>(Lj2/h;)V

    return-void
.end method


# virtual methods
.method public b(Lk2/u;)Z
    .locals 1

    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lk2/u;->j:Lf2/b;

    invoke-virtual {p1}, Lf2/b;->d()Lf2/k;

    move-result-object p1

    sget-object v0, Lf2/k;->METERED:Lf2/k;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lh2/b;

    invoke-virtual {p0, p1}, Li2/e;->i(Lh2/b;)Z

    move-result p1

    return p1
.end method

.method public i(Lh2/b;)Z
    .locals 5

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_0

    invoke-static {}, Lf2/j;->e()Lf2/j;

    move-result-object v0

    sget-object v1, Li2/e;->g:Ljava/lang/String;

    const-string v4, "Metered network constraint is not supported before API 26, only checking for connected state."

    invoke-virtual {v0, v1, v4}, Lf2/j;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh2/b;->a()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lh2/b;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lh2/b;->b()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    :goto_0
    move v2, v3

    :cond_2
    return v2
.end method
