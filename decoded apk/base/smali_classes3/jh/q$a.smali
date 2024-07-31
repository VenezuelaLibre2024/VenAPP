.class Ljh/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljh/q;->a(Ljava/util/List;Lih/p;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lih/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lih/p;

.field final synthetic b:Ljh/q;


# direct methods
.method constructor <init>(Ljh/q;Lih/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ljh/q$a;->b:Ljh/q;

    iput-object p2, p0, Ljh/q$a;->a:Lih/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lih/p;Lih/p;)I
    .locals 2

    iget-object v0, p0, Ljh/q$a;->b:Ljh/q;

    iget-object v1, p0, Ljh/q$a;->a:Lih/p;

    invoke-virtual {v0, p1, v1}, Ljh/q;->c(Lih/p;Lih/p;)F

    move-result p1

    iget-object v0, p0, Ljh/q$a;->b:Ljh/q;

    iget-object v1, p0, Ljh/q$a;->a:Lih/p;

    invoke-virtual {v0, p2, v1}, Ljh/q;->c(Lih/p;Lih/p;)F

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lih/p;

    check-cast p2, Lih/p;

    invoke-virtual {p0, p1, p2}, Ljh/q$a;->a(Lih/p;Lih/p;)I

    move-result p1

    return p1
.end method
