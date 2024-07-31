.class public final synthetic Ll4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/m$b;


# instance fields
.field public final synthetic a:Lcom/facebook/internal/r;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/internal/r;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/c;->a:Lcom/facebook/internal/r;

    iput-object p2, p0, Ll4/c;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ll4/c;->a:Lcom/facebook/internal/r;

    iget-object v1, p0, Ll4/c;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Ll4/e;->b(Lcom/facebook/internal/r;Ljava/lang/String;)V

    return-void
.end method
