.class Leb/s$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/s$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leb/s;->e(Leb/d;)Leb/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Leb/d;


# direct methods
.method constructor <init>(Leb/d;)V
    .locals 0

    iput-object p1, p0, Leb/s$a;->a:Leb/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Leb/s;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1, p2}, Leb/s$a;->b(Leb/s;Ljava/lang/CharSequence;)Leb/s$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Leb/s;Ljava/lang/CharSequence;)Leb/s$b;
    .locals 1

    new-instance v0, Leb/s$a$a;

    invoke-direct {v0, p0, p1, p2}, Leb/s$a$a;-><init>(Leb/s$a;Leb/s;Ljava/lang/CharSequence;)V

    return-object v0
.end method
