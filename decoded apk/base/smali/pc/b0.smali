.class public final synthetic Lpc/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/a$a;


# instance fields
.field public final synthetic a:Lee/a$a;

.field public final synthetic b:Lee/a$a;


# direct methods
.method public synthetic constructor <init>(Lee/a$a;Lee/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc/b0;->a:Lee/a$a;

    iput-object p2, p0, Lpc/b0;->b:Lee/a$a;

    return-void
.end method


# virtual methods
.method public final a(Lee/b;)V
    .locals 2

    iget-object v0, p0, Lpc/b0;->a:Lee/a$a;

    iget-object v1, p0, Lpc/b0;->b:Lee/a$a;

    invoke-static {v0, v1, p1}, Lpc/c0;->d(Lee/a$a;Lee/a$a;Lee/b;)V

    return-void
.end method
