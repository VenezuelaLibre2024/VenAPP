.class final Ll3/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld4/a$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll3/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field final a:Ljava/security/MessageDigest;

.field private final b:Ld4/c;


# direct methods
.method constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ld4/c;->a()Ld4/c;

    move-result-object v0

    iput-object v0, p0, Ll3/j$b;->b:Ld4/c;

    iput-object p1, p0, Ll3/j$b;->a:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public h()Ld4/c;
    .locals 1

    iget-object v0, p0, Ll3/j$b;->b:Ld4/c;

    return-object v0
.end method
