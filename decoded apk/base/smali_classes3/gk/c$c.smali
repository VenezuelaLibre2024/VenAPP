.class final Lgk/c$c;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk/c;->writeReplace()Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/p<",
        "Lck/v;",
        "Lgk/f$b;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:[Lgk/f;

.field final synthetic b:Lkotlin/jvm/internal/w;


# direct methods
.method constructor <init>([Lgk/f;Lkotlin/jvm/internal/w;)V
    .locals 0

    iput-object p1, p0, Lgk/c$c;->a:[Lgk/f;

    iput-object p2, p0, Lgk/c$c;->b:Lkotlin/jvm/internal/w;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lck/v;Lgk/f$b;)V
    .locals 3

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "element"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lgk/c$c;->a:[Lgk/f;

    iget-object v0, p0, Lgk/c$c;->b:Lkotlin/jvm/internal/w;

    iget v1, v0, Lkotlin/jvm/internal/w;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, v0, Lkotlin/jvm/internal/w;->a:I

    aput-object p2, p1, v1

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lck/v;

    check-cast p2, Lgk/f$b;

    invoke-virtual {p0, p1, p2}, Lgk/c$c;->a(Lck/v;Lgk/f$b;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
