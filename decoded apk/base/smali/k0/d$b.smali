.class Lk0/d$b;
.super Lk0/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic g:Lk0/d;


# direct methods
.method public constructor <init>(Lk0/d;Lk0/c;)V
    .locals 0

    iput-object p1, p0, Lk0/d$b;->g:Lk0/d;

    invoke-direct {p0}, Lk0/b;-><init>()V

    new-instance p1, Lk0/j;

    invoke-direct {p1, p0, p2}, Lk0/j;-><init>(Lk0/b;Lk0/c;)V

    iput-object p1, p0, Lk0/b;->e:Lk0/b$a;

    return-void
.end method
