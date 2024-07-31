.class public final synthetic Lzd/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/e;


# instance fields
.field public final synthetic a:Lzd/c3;

.field public final synthetic b:Lde/m;


# direct methods
.method public synthetic constructor <init>(Lzd/c3;Lde/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/j3;->a:Lzd/c3;

    iput-object p2, p0, Lzd/j3;->b:Lde/m;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzd/j3;->a:Lzd/c3;

    iget-object v1, p0, Lzd/j3;->b:Lde/m;

    check-cast p1, Lzd/b3;

    invoke-static {v0, v1, p1}, Lzd/m3;->c(Lzd/c3;Lde/m;Lzd/b3;)Lzd/c3;

    move-result-object p1

    return-object p1
.end method
