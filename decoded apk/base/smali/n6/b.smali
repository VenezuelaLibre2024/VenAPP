.class public final synthetic Ln6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/b$a;


# instance fields
.field public final synthetic a:Ln6/c;

.field public final synthetic b:Lh6/p;

.field public final synthetic c:Lh6/i;


# direct methods
.method public synthetic constructor <init>(Ln6/c;Lh6/p;Lh6/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/b;->a:Ln6/c;

    iput-object p2, p0, Ln6/b;->b:Lh6/p;

    iput-object p3, p0, Ln6/b;->c:Lh6/i;

    return-void
.end method


# virtual methods
.method public final n()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ln6/b;->a:Ln6/c;

    iget-object v1, p0, Ln6/b;->b:Lh6/p;

    iget-object v2, p0, Ln6/b;->c:Lh6/i;

    invoke-static {v0, v1, v2}, Ln6/c;->c(Ln6/c;Lh6/p;Lh6/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
