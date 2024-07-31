.class final Loi/s$d;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/s;->M(Lvf/b;ZLw/p;ZLpi/b;Lok/l;Lok/l;Lok/l;Lok/l;JLandroid/util/Size;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Ljava/lang/Integer;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lok/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/l<",
            "Ljava/lang/Integer;",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lok/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/l<",
            "-",
            "Ljava/lang/Integer;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loi/s$d;->a:Lok/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, Loi/s$d;->a:Lok/l;

    invoke-static {p1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Lok/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Loi/s$d;->a(Ljava/lang/Integer;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
