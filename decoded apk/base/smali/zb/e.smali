.class public final synthetic Lzb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/b;


# instance fields
.field public final synthetic a:Lzb/g;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lzb/g;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzb/e;->a:Lzb/g;

    iput-object p2, p0, Lzb/e;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzb/e;->a:Lzb/g;

    iget-object v1, p0, Lzb/e;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lzb/g;->b(Lzb/g;Landroid/content/Context;)Lke/a;

    move-result-object v0

    return-object v0
.end method
