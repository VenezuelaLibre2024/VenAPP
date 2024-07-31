.class public final synthetic Lzd/h3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/g;


# instance fields
.field public final synthetic a:Lzd/m3;

.field public final synthetic b:Lde/m;


# direct methods
.method public synthetic constructor <init>(Lzd/m3;Lde/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/h3;->a:Lzd/m3;

    iput-object p2, p0, Lzd/h3;->b:Lde/m;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lzd/h3;->a:Lzd/m3;

    iget-object v1, p0, Lzd/h3;->b:Lde/m;

    check-cast p1, Lzd/b3;

    invoke-static {v0, v1, p1}, Lzd/m3;->b(Lzd/m3;Lde/m;Lzd/b3;)Z

    move-result p1

    return p1
.end method
