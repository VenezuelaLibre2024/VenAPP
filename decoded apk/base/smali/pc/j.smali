.class public final synthetic Lpc/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/b;


# instance fields
.field public final synthetic a:Lpc/n;

.field public final synthetic b:Lpc/c;


# direct methods
.method public synthetic constructor <init>(Lpc/n;Lpc/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc/j;->a:Lpc/n;

    iput-object p2, p0, Lpc/j;->b:Lpc/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lpc/j;->a:Lpc/n;

    iget-object v1, p0, Lpc/j;->b:Lpc/c;

    invoke-static {v0, v1}, Lpc/n;->i(Lpc/n;Lpc/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
