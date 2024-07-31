.class public final synthetic Lzd/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/g;


# instance fields
.field public final synthetic a:Lzd/i2;


# direct methods
.method public synthetic constructor <init>(Lzd/i2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/b1;->a:Lzd/i2;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lzd/b1;->a:Lzd/i2;

    check-cast p1, Lof/c;

    invoke-static {v0, p1}, Lzd/i2;->a(Lzd/i2;Lof/c;)Z

    move-result p1

    return p1
.end method
