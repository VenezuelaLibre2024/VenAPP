.class final Lz0/c$a;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lok/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz0/c;->c(Landroid/content/Context;Lvk/h;)Lx0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/o;",
        "Lok/a<",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lz0/c;


# direct methods
.method constructor <init>(Landroid/content/Context;Lz0/c;)V
    .locals 0

    iput-object p1, p0, Lz0/c$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lz0/c$a;->b:Lz0/c;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 2

    iget-object v0, p0, Lz0/c$a;->a:Landroid/content/Context;

    const-string v1, "applicationContext"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lz0/c$a;->b:Lz0/c;

    invoke-static {v1}, Lz0/c;->b(Lz0/c;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lz0/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz0/c$a;->a()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
