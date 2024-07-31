.class final Landroidx/lifecycle/a0$d;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/a0;->e(Landroidx/lifecycle/k0;)Landroidx/lifecycle/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Li1/a;",
        "Landroidx/lifecycle/c0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Landroidx/lifecycle/a0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/a0$d;

    invoke-direct {v0}, Landroidx/lifecycle/a0$d;-><init>()V

    sput-object v0, Landroidx/lifecycle/a0$d;->a:Landroidx/lifecycle/a0$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Li1/a;)Landroidx/lifecycle/c0;
    .locals 1

    const-string v0, "$this$initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroidx/lifecycle/c0;

    invoke-direct {p1}, Landroidx/lifecycle/c0;-><init>()V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Li1/a;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/a0$d;->a(Li1/a;)Landroidx/lifecycle/c0;

    move-result-object p1

    return-object p1
.end method
