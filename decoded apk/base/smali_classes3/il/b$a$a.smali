.class final Lil/b$a$a;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lil/b$a;->a(Lck/v;Lok/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/l<",
        "Ljava/lang/Throwable;",
        "Lck/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lil/b;

.field final synthetic b:Lil/b$a;


# direct methods
.method constructor <init>(Lil/b;Lil/b$a;)V
    .locals 0

    iput-object p1, p0, Lil/b$a$a;->a:Lil/b;

    iput-object p2, p0, Lil/b$a$a;->b:Lil/b$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lil/b$a$a;->a:Lil/b;

    iget-object v0, p0, Lil/b$a$a;->b:Lil/b$a;

    iget-object v0, v0, Lil/b$a;->b:Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lil/b;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lil/b$a$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
