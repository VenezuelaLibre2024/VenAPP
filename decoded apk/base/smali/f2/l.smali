.class public final Lf2/l;
.super Lf2/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf2/l$a;,
        Lf2/l$b;
    }
.end annotation


# static fields
.field public static final e:Lf2/l$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf2/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/l$b;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lf2/l;->e:Lf2/l$b;

    return-void
.end method

.method public constructor <init>(Lf2/l$a;)V
    .locals 2

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lf2/u$a;->e()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {p1}, Lf2/u$a;->h()Lk2/u;

    move-result-object v1

    invoke-virtual {p1}, Lf2/u$a;->f()Ljava/util/Set;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lf2/u;-><init>(Ljava/util/UUID;Lk2/u;Ljava/util/Set;)V

    return-void
.end method

.method public static final e(Ljava/lang/Class;)Lf2/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/work/c;",
            ">;)",
            "Lf2/l;"
        }
    .end annotation

    sget-object v0, Lf2/l;->e:Lf2/l$b;

    invoke-virtual {v0, p0}, Lf2/l$b;->a(Ljava/lang/Class;)Lf2/l;

    move-result-object p0

    return-object p0
.end method
